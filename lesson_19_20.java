import java.util.ArrayList;
import java.util.Collections;

public class lesson_19_20 {
    //В классе lesson_19_20 публичный метод print(ArrayList<Integer>) выводит в консоли все элементы списка по порядку.
    //Сейчас метод реализован с использованием метода списка forEach(), который принимает ссылку на метод.
    //Необходимо переписать реализацию метода print(ArrayList<Integer>),
    //чтобы метод списка forEach() вместо ссылки на метод принимал лямбда-выражения.
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(s-> System.out.println(s));
    }
}
