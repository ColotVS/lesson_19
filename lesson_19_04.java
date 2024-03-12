import java.util.Scanner;

public class lesson_19_04 {
    //Интерфейс Comparator

    //На самом деле все очень просто. Тип второго параметра метода sort() — Comparator<T>

    //Где T — это тип-параметр, такой же, как и тип элементов коллекции,
    //а Comparator — это интерфейс, который имеет единственный метод int compare(T obj1, T obj2);

    //Другими словами, объект-компаратор — это любой объект класса, который реализует интерфейс Comparator.

    //Выглядит интерфейс Comparator очень просто:
    /*
    public interface Comparator<Tип>
    {
        public int compare(Tип obj1, Tип obj2);
    }
    */

    //Метод compare() сравнивает два параметра, которые в него передают.

    //Если метод возвращает отрицательное число, то obj1 < obj2.
    //Если метод возвращает положительное число, то obj1 > obj2.
    //Если метод возвращает 0, то считается, что obj1 == obj2.

    //Вот как будет выглядеть объект компаратор, который сравнивает строки по их длине:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String one = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String two = scanner.nextLine();
        StringLengthComparator comparator = new StringLengthComparator();
        if(comparator.compare(one,two)>0){
            System.out.println("Первая строка больше");
        }
        else if (comparator.compare(one,two)<0){
            System.out.println("Вторая строка больше");
        }
        else System.out.println("Строки равны");
    }
}
interface Comparator<String>
{
    public int compare(String obj1, String obj2);
}
class StringLengthComparator implements Comparator<String>
{
    public int compare (String obj1, String obj2)
    {
        return obj1.length() - obj2.length();
    }
}
