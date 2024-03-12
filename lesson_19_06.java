import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lesson_19_06 {
    //В классе lesson_19_06 есть статическое поле students, которое заполняется студентами (объектами типа Student) в методе main().
    //У студента (класс Student) есть имя (поле name) и возраст (поле age).
    //Нужно отсортировать в программе студентов по возрасту в убывающем порядке (от старшего к младшему).
    //Для этого используется метод Collections.sort(ArrayList<Student>, Comparator<Student>),
    //в который передается список студентов students и компаратор сортировки по убыванию возраста.
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(students,
                new Student("Иванов", 22),
                new Student("Петров", 18),
                new Student("Сидоров", 19)
        );

        students.sort(new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент - " + name +
                ", возраст - " + age +
                '.';
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}
