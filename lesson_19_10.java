public class lesson_19_10 {
    //Сортировка

    //Кстати, код вызова сортировки теперь можно записать так:

    /*
    Comparator<String> comparator = (String obj1, String obj2) ->
    {
        return obj1.length() - obj2.length();
    };
    Collections.sort(list, comparator);
    */

    //Или даже так:

    /*
    Collections.sort(list, (String obj1, String obj2) ->
        {
        return obj1.length() - obj2.length();
        }
    );
    */

    //Мы просто подставили вместо переменной comparator сразу то значение, которое присваивали переменной comparator.
}
