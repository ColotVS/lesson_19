public class lesson_19_15 {
    //Функциональные методы

    //Если у интерфейса есть только один метод, переменной этого типа-интерфейса можно присвоить значение,
    // заданное лямбда-выражением (лямбда-функцией).
    //Такие интерфейсы стали называть функциональными интерфейсами (после добавления в Java поддержки лямбда-функций).

    //Например, в Java есть интерфейс Consumer<Тип> (Consumer == Потребитель), который содержит метод accept(Тип obj).
    //Зачем же нужен этот интерфейс?

    //В Java 8 у коллекций появился метод forEach(), который позволяет для каждого элемента коллекции выполнить какое-нибудь действие.
    //И вот для передачи действия в метод forEach() как раз и используется функциональный интерфейс Consumer<T>.

    //Вот как можно вывести все элементы коллекции на экран:
    /*
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "Привет", "как", "дела?");
    list.forEach( (s) -> System.out.println(s) );
    */
    //Вывод всех элементов коллекции (с использованием лямбда-выражения)

    //Компилятор преобразует этот код в код:
    /*
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "Привет", "как", "дела?");
    list.forEach(new Consumer<String>()
    {
        public void accept(String s)
        {
            System.out.println(s);
        }
    });
    */
    //Вывод всех элементов коллекции (запись с использованием анонимного класса)

    //Первая запись однозначно короче, чем вторая.
    //И хотя читать код с лямбда-выражениями непросто, читать код с анонимными внутренними классами порой еще сложнее.


}
