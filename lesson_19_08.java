import java.util.ArrayList;
import java.util.Collections;

public class lesson_19_08 {
    //Синтаксический сахар

    //А как вы думаете, можно ли записать данный код короче?
    //По сути, тут только одна строка, которая несет полезную информацию — obj1.length() - obj2.length();.

    //Но ведь код не может существовать вне метода, поэтому пришлось добавить метод compare(),
    //а для метода пришлось добавить новый класс – StringLengthComparator. И еще типы переменных нужно указывать...
    //В общем, вроде бы все правильно.

    //Однако, есть способы записать этот код короче.

    //Анонимный внутренний класс

    //Вы можете записать код компаратора прямо внутри метода main(), а компилятор сам сделает все остальное.

    //Пример:
    /*
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Comparator<String> comparator = new Comparator<String>()
        {
            public int compare (String obj1, String obj2)
            {
                return obj1.length() - obj2.length();
            }
        };

        Collections.sort(list, comparator);
        }
    }
    */

    //Сортировка строк по длине

    //Вы можете создать объект наследник интерфейса Comparator, не создавая сам класс!
    //Компилятор создаст его автоматически и даст ему какое-нибудь временное имя.
    //Сравните:

    /*
    Comparator<String> comparator = new Comparator<String>()
    {
        public int compare (String obj1, String obj2)
        {
        return obj1.length() - obj2.length();
        }
    };
    */

    //Анонимный внутренний класс


}