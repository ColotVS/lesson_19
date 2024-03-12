import java.util.ArrayList;
import java.util.Collections;

public class lesson_19_12 {
    //Перед тобой программа, которая сортирует список чисел по возрастанию.
    //Метод sortNumbers(ArrayList<Integer>) принимает список, элементы которого необходимо отсортировать.
    //Для сортировки используется метод Collections.sort(ArrayList<Integer>, Comparator<Integer>),
    //параметрами которого являются список чисел и компаратор.
    //Твоя задача — переписать реализацию метода sortNumbers(ArrayList<Integer>),
    //чтобы вместо использования внутреннего анонимного класса Comparator<Integer> использовалось лямбда-выражение.
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {
        numbers.sort((i1, i2) -> i1 - i2);
    }
}
