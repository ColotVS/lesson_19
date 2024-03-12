public class lesson_19_11 {
    //Выведение типов

    //Но и это еще не все. Код в этих примерах можно записать еще короче.
    //Во-первых, компилятор может сам определить, что у переменных obj1 и obj2 тип String.
    //А во-вторых, фигурные скобки и оператор return тоже можно не писать, если у вас в коде метода всего одна команда.

    //Сокращенный вариант будет таким:
    /*
    Comparator<String> comparator = (obj1, obj2) ->
    obj1.length() - obj2.length();
    Collections.sort(list, comparator);
    */

    //А если вместо переменной comparator сразу подставить ее значение, то получим такой вариант:
    //Collections.sort(list, (obj1, obj2) ->  obj1.length() - obj2.length() );

    //Ну и как вам: всего одна строка кода, никакой лишней информации — только переменные и код. Короче уже некуда! Или есть куда?
}
