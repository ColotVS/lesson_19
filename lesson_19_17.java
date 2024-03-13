import java.util.ArrayList;
import java.util.Collections;

public class lesson_19_17 {
    //В классе Solution публичный метод print(ArrayList<String>) выводит в консоли все элементы списка по порядку.
    //Сейчас метод реализован с использованием метода списка forEach().
    //Необходимо переписать реализацию метода print(ArrayList<String>), используя оператор for, не меняя логику работы метода.
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings)
    {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
