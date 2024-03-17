import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class lesson_19_36 {
    //У учетной записи (класс Account) есть имя (поле name) и электронный ящик (поле email).
    //Нужно, чтобы метод getEmails(ArrayList<Account>)
    //в классе lesson_19_36 возвращал поток электронных ящиков всех учетных записей из списка,
    //полученного в качестве входящего аргумента.

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        return accounts.stream().map(Account::getEmail);
    }
}

class Account {
    private String name;
    private String email;

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
