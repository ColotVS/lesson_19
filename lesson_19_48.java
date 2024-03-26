import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson_19_48 {
    //Преобразование потока в мэп

    //А вот преобразовать поток в мэп немного сложнее.
    //Ведь каждый объект Map состоит из двух элементов — ключа и значения.
    //Нам нужно придумать, как у элемента потока мы будем определять ключ, а как — значение.

    //Пример.

    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
    //Map<String, String> result = list.stream()
    //   .map( e -> e.split("=") )
    //   .filter( e -> e.length == 2 )
    //   .collect( Collectors.toMap(e -> e[0], e -> e[1]) );

    //Давайте разберем, что тут происходит.

    //В первой строчке map(...) мы преобразовываем каждую строку в массив строк.
    //Используя метод split, мы делим каждую строку на две части по символу «равно».
    //Во второй строке — метод filter() — мы пропускаем через фильтр только те элементы-массивы,
    //которые содержат ровно два элемента. Элемент d == 3 был разбит на массив из трех элементов, и фильтр не пройдет.
    //И наконец, в последней строке мы превращаем поток в Map<String, String>. В метод toMap() передаются две функции.
    //Для каждого элемента потока первая функция должна вернуть ключ, а вторая — значение.


    //Необходимо, чтобы метод getMap(Stream<String>) преобразовывал входящий поток строк в карту (map),
    //ключом которой является сама строка, а значением — её длина.
    //Реализуй его, используя метод collect() объекта типа Stream<String>.
    //В качестве параметра передай нужный коллектор (объект типа Collector<Map<String, Integer>>).
    //Такой объект можно получить, вызвав статический метод toMap() класса Collectors.

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream.collect(Collectors.toMap(s -> s, String::length));
    }
}
