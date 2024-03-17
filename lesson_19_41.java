import java.util.NoSuchElementException;

public class lesson_19_41 {
    //Иногда программистам очень неудобно работать с ссылками на null.
    //Например, вы сравниваете две строки. Если обе переменные не null,
    //тогда можно просто вызвать s1.equals(s2), и все будет работать.
    //А вот если s1 может быть null, придется писать код, который учитывает эту ситуацию, чтобы не возникло NullPointerException.

    //Поэтому программисты придумали служебный класс Optional<T>. Выглядит его код примерно так:


}
class Optional<String>
{
    private final String value;

    Optional(String value) {this.value = value;}

    //Optional() { this.value = null;}
    //Optional(value) { this.value = value;}
    public static <String> Optional<String> of(String value)
    {
        return new Optional<String>(value);
    }

    public boolean isPresent()                  //Проверяет, что внутри находится значение (ссылка не null)
    {
        return value != null;
    }

    public boolean isEmpty()                    //Проверяет, что объект хранит ссылку на null
    {
        return value == null;
    }

    public String get()                         //Возвращает значение, которое хранит. Кидает исключение, если значения нет.
    {
        if (value == null)
        {
            throw new NoSuchElementException();
        }
        return value;
    }

    public String orElse(String other)          //Возвращает значение, или если внутри хранится null, то переданное в метод второе значение
    {
        return value != null ? value : other;
    }

    public String orElseThrow()                 //Возвращает значение или кидает исключение, если значения нет.
    {
        if (value == null)
        {
            throw new NoSuchElementException();
        }
        return value;
    }
    //Цель этого класса – просто хранить в себе объект T (ссылку на объект типа T).
    //Ссылка на объект внутри класса Optional<T> может быть null.
    //Этот класс позволяет писать программистам код немного красивее.
    //Сравните:

    //С использованием Optional	                                    Без использования Optional
    //public void printString(String s)                             public void printString(String s)
    //{                                                             {
    //   Optional<String> str = Optional.ofNullable(s);                 String str = s != null ? s : "";
    //   System.out.println(str.orElse(""));                            System.out.println(str)
    //}                                                             }

    //Один объект Optional всегда можно сравнить с другим объектом Optional через метод equals,
    //даже если они хранят в себе ссылки на null.
    //Грубо говоря, класс Optional позволяет «более красиво» записывать проверки на null и действия в случае,
    //если внутри объект Optional хранится null.
}
