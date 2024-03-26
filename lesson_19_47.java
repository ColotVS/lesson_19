import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson_19_47 {
    //Преобразование потока во множество

    //Вот как выглядит типичная работа с потоком и преобразование результата работы во множество

    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "Привет", "как", "дела?");
    //Set<String> result = list.stream()
    //   .filter( s -> Character.isUpperCase(s.charAt(0)) )
    //   .collect( Collectors.toSet() );

    //Все очень похоже на код по преобразованию потока в List, только используется другой объект-коллектор,
    //который возвращает метод toSet();

    //Необходимо, чтобы метод getFilteredStrings(Stream<String>) преобразовывал входящий поток строк во множество строк,
    //длина которых больше шести символов.
    //Реализуй его, используя метод collect() объекта типа Stream<String>.
    //В качестве параметра передай нужный коллектор (объект типа Collector<Set<String>>).
    //Такой объект можно получить, вызвав статический метод toSet() класса Collectors.

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        return stringStream.filter(x -> x.length()>6).collect(Collectors.toSet());
    }
}
