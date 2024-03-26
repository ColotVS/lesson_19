import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson_19_49 {
    //Преобразование потока в строку
    //Еще один интересный объект-коллектор — это Collectors.joining().
    //Он преобразовывает все элементы потока к типу String и склеивает их в одну строку. Пример

    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
    //String result = list.stream().collect( Collectors.joining(", ") );

    //Необходимо, чтобы метод getString(Stream<String>) преобразовывал входящий поток строк в строку,
    //слова в которой нужно разделить пробелом. Порядок слов в строке должен соответствовать порядку элементов в потоке.
    //Реализуй его, используя метод collect() объекта типа Stream<String>.
    //В качестве параметра передай нужный коллектор (объект типа Collector<String>).
    //Такой объект можно получить, вызвав статический метод joining() класса Collectors.

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
}
