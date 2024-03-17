import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
public class lesson_19_32 {
    //Класс Language представляет собой модель языка программирования.
    //В этом классе есть два поля: name - название языка программирования,
    //ranking - рейтинг использования языка программирования по состоянию на сентябрь 2020 года, согласно TIOBE.
    //Нужно, чтобы публичный статический метод sortByRanking(ArrayList<Language>)
    //сортировал полученный список языков программирования по убыванию рейтинга,
    //и возвращал отсортированный поток данных (Stream<Language>).

    public static void main(String[] args) {
        ArrayList<Language> languages = new ArrayList<>();
        Collections.addAll(languages,
                new Language("С#", 4.58),
                new Language("JavaScript", 2.54),
                new Language("Python", 10.47),
                new Language("C++", 7.11),
                new Language("Go", 1.46),
                new Language("R", 2.37),
                new Language("Java", 13.48),
                new Language("C", 15.95),
                new Language("Swift", 1.38),
                new Language("PHP", 2.49));

        Stream<Language> languageStream = sortByRanking(languages);
        languageStream.forEach(System.out::println);
    }

    public static Stream<Language> sortByRanking(ArrayList<Language> languages) {

        return languages.stream()
                .sorted((s1, s2) -> Double.compare(s2.getRanking(), s1.getRanking()));
    }

}

class Language {
    private String name;
    private Double ranking;

    public Language(String name, Double ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public Double getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return "Язык программирования - " + name + ", рейтинг  - " + ranking + "% опрошенных.";
    }
}