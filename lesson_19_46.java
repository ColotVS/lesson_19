import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson_19_46 {
    //Преобразование потока в список

    //Вот как выглядит типичная работа с потоком и преобразование результата работы в список

    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "Привет", "как", "дела?");
    //List<String> result = list.stream()
    //   .filter( s -> Character.isUpperCase(s.charAt(0)) )
    //   .collect( Collectors.toList() );

    //Мы получили поток у коллекции, затем у него получили новый поток, отфильтровав только строки,
    //первый символ которых — заглавный. Затем все данные из последнего потока собрали в коллекцию и вернули ее.

    //Для решения этой задачи необходимо, чтобы метод getPositiveNumbers(Stream<Integer>)
    //преобразовывал входящий поток чисел в список чисел больше нуля.
    //Реализуй его, используя метод collect() объекта типа Stream<Integer>.
    //В качестве параметра передай нужный коллектор (объект типа Collector<List<Integer>>).
    //Такой объект можно получить, вызвав статический метод toList() класса Collectors.

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        return numbers.filter(s -> (s>0)).collect(Collectors.toList());
    }
}
