import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lesson_19_13 {
    //Перед тобой программа, которая сортирует список строк по их длине по возрастанию.
    //Это делает метод sortStringsByLength(ArrayList<String>).
    //Для сортировки строк используется метод Collections.sort(ArrayList<String>, Comparator<String>),
    //который принимает список строк и компаратор в виде лямбда-выражения.
    //Твоя задача — переписать реализацию метода sortStringsByLength(ArrayList<String>),
    //чтобы вместо лямбда-выражения использовался класс StringComparator,
    //который реализует интерфейс Comparator<String>, не меняя логику работы метода sortStringsByLength(ArrayList<String>).
    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        strings.sort(new StringComparator());
    }
}
class StringComparator implements  Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }


}
