import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lesson_19_07 {
    //В классе lesson_19_07 есть статическое поле mentors,
    //которое заполняется менторами JavaRush (объектами типа JavaRushMentor) в методе main().
    //У ментора (класс JavaRushMentor) есть имя (поле name).
    //В программе нужно отсортировать менторов по длине имени в возрастающем порядке (от самого короткого до самого длинного).
    public static ArrayList<JavaRushMentor> mentors = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(mentors,
                new JavaRushMentor("Джон Бобров"),
                new JavaRushMentor("Риша"),
                new JavaRushMentor("Эллеонора Керри"),
                new JavaRushMentor("Ханс Нудлс"),
                new JavaRushMentor("Ким"),
                new JavaRushMentor("Хулио Сиеста"),
                new JavaRushMentor("Диего"),
                new JavaRushMentor("Лага Билаабо")
        );

        mentors.sort(new NameComparator());

        for (JavaRushMentor mentor : mentors) {
            System.out.println(mentor);
        }
    }
}

class JavaRushMentor {
    private final String name;

    public JavaRushMentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ментор по имени - " + name;
    }
}

class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        return o1.getName().length()-o2.getName().length();
    }
}
