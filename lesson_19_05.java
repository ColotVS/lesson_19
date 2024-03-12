import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lesson_19_05 {
    //Полный код программы, которая сортирует строки по длине, будет выглядеть вот так:
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String element:list){
            System.out.println(element);
        }
    }
}



