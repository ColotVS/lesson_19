import java.util.ArrayList;
import java.util.List;

public class lesson_19_29 {
    //Осталось дописать код метода main, в котором вначале вызовем метод initData(),
    //который заполнит данными список владельцев животных в клубе, а потом выберет имена рыжих котов,
    //отсортированных по возрасту в убывающем порядке.
    //Код значительно компактнее.
    //Кроме этого, каждая строчка стрима – это какое-то одно действие, поэтому их можно читать, как предложения на английском языке:

    public static void main(String[] args) {
        Selector.initData();

        final List<String> findNames = Selector.owners.stream()
                .flatMap(owner -> owner.getPets().stream())                     //переход от Stream<Owner> к Stream<Pet>
                .filter(pet -> Cat.class.equals(pet.getClass()))                //в потоке данных оставляем только котов
                .filter(cat -> Color.FOXY == cat.getColor())                    //в потоке данных оставляем только рыжих
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())                  //сортируем по возрасту в убывающем порядке
                .map(Animal::getName)                                           //берем имена
                .toList();                                                      //результат складываем в список

        findNames.forEach(System.out::println);
    }
}
//Давайте рассмотрим пример.
//Есть клуб любителей животных. Завтра у них день «рыжего кота». В клубе есть владельцы животных, у каждого из которых есть список питомцев. Это могут быть не только коты.

//Задача: нужно выбрать имена всех рыжих котов, чтобы на завтра распечатать для них именные поздравительные открытки с «Профессиональным праздником». Открытки должны быть отсортированы по возрасту кота: от более старого до более молодого.

//Вначале приведем вспомогательные классы для решения этой задачи:
enum Color {
    WHITE,
    BLACK,
    DARK_GREY,
    LIGHT_GREY,
    FOXY,
    GREEN,
    YELLOW,
    BLUE,
    MAGENTA
}

abstract class Animal {
    private String name;
    private Color color;
    private int age;

    public Animal(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}

class Cat extends Animal{
    public Cat(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Dog extends Animal {
    public Dog(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Parrot extends Animal {
    public Parrot(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Pig extends Animal {
    public Pig(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Snake extends Animal {
    public Snake(String name, Color color, int age) {
        super(name, color, age);
    }
}

class Owner {
    private String name;
    private List<Animal> pets = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public List<Animal> getPets() {
        return pets;
    }
}

//Теперь рассмотрим класс Selector, в котором будет производиться выбор по приведенным критериям:

class Selector {
    static List<Owner> owners;

    static void initData() {
        final Owner owner1 = new Owner("Олег Малашков");
        owner1.getPets().addAll(List.of(
                new Cat("Барон", Color.BLACK, 3),
                new Cat("Султан", Color.DARK_GREY, 4),
                new Dog("Эльза", Color.WHITE, 0)
        ));

        final Owner owner2 = new Owner("Дмитрий Васильков");
        owner2.getPets().addAll(List.of(
                new Cat("Рыжик", Color.FOXY, 7),
                new Cat("Барсик", Color.FOXY, 5),
                new Parrot("Адмирал", Color.BLUE, 3)
        ));

        final Owner owner3 = new Owner("Наталия Криж");
        owner3.getPets().addAll(List.of(
                new Dog("Арнольд", Color.FOXY, 3),
                new Pig("Пылесос", Color.LIGHT_GREY, 8)
        ));

        final Owner owner4 = new Owner("Павел Мурахов");
        owner4.getPets().add(
                new Snake("Удав", Color.DARK_GREY, 2)
        );

        final Owner owner5 = new Owner("Антон Федоренко");
        owner5.getPets().addAll(List.of(
                new Cat("Фишер", Color.BLACK, 16),
                new Cat("Зорро", Color.FOXY, 14),
                new Cat("Марго", Color.WHITE, 3),
                new Cat("Забияка", Color.DARK_GREY, 1)
        ));

        owners = List.of(owner1, owner2, owner3, owner4, owner5);
    }
}
