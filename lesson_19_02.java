import java.util.ArrayList;

public class lesson_19_02 {
    //В интерфейсе Runnable объявлен метод run() и есть две его реализации: в классе Car и в классе Plane.
    //В классе lesson_19_02 есть публичное статическое поле ArrayList<Runnable> list, а также два публичных статических метода:
    //addToList(Runnable), который добавляет в список list элемент,
    //полученный в качестве входного параметра, и метод runList(), который вызывает метод run() у каждого элемента списка list.
    //Твоя задача — реализовать эти методы.

    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (Runnable element:list)
        {
            element.run();
        }
    }
}

interface Runnable {
    void run();
}

class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}

class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}
