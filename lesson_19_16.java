import java.util.ArrayList;
import java.util.Collections;

public class lesson_19_16 {
    //В классе lesson_19_16 публичный метод print(ArrayList<Integer>) выводит в консоли все элементы списка по порядку.
    //Сейчас метод реализован с использованием оператора for.
    //Необходимо переписать реализацию метода print(ArrayList<Integer>),
    //используя метод списка forEach(), принимающий лямбда-выражение.
    //Логику работы метода print(ArrayList<Integer>) менять не нужно.
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach((s)-> System.out.println(s));
    }
}
