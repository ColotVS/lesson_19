public class lesson_19_38 {
    //Проверка
    //У класса Stream есть три стандартных метода, которые не конструируют потоки,
    //а проверяют, что за данные находятся в этих потоках.
    //Это методы: anyMatch(), allMatch() и noneMatch().

    //Метод boolean anyMatch(правило)
    //Этот метод проверяет, что в потоке есть хотя бы один элемент, который удовлетворяет правилу, которое передается в метод.
    //Если такой элемент есть, метод возвращает true, иначе — false.

    //Код	                                                                Примечание
    //Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    //boolean result = stream.anyMatch(x -> x > 0);                         true

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.anyMatch(x -> x > 0);                         true

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.filter(x -> x < 0).anyMatch(x -> x > 0);      false

    //В последнем примере мы сначала отфильтровываем (пропускаем через фильтр) все элементы меньше нуля,
    //а затем уже среди них проводим проверку, есть ли хотя бы один элемент больше нуля.
    //Ясное дело, таких элементов там уже нет.


    //Метод boolean allMatch(правило)
    //Этот метод проверяет, что все элементы в потоке соответствуют правилу.
    //Правило передается в метод в качестве параметра:

    //Код	                                                                Примечание
    //Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    //boolean result = stream.allMatch(x -> x > 0);                         true (все элементы больше нуля)

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.allMatch(x -> x > 0);                         false (есть элементы меньше или равны нулю)

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.filter(x -> x < 0).allMatch(x -> x < 0);      true (отфильтровали элементы меньше нуля)

    //В последнем примере мы сначала пропускаем через фильтр только элементы меньше нуля,
    //а потом уже среди них выполняем проверку, что все элементы меньше нуля.
    //Проверка проходит успешно.


    //Метод boolean noneMatch(правило)
    //Метод noneMatch() проверяет, что в потоке нет ни одного элемента, который соответствует переданному правилу.
    //Противоположный по смыслу метод к методу anyMatch().

    //Код	                                                                Примечание
    //Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    //boolean result = stream.noneMatch(x -> x > 0);                        false

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.noneMatch(x -> x > 0);                        false

    //Stream<Integer> stream = Stream.of(1, -2, 3, -4, 5);
    //boolean result = stream.filter(x -> x < 0).noneMatch(x -> x > 0);     true
}
