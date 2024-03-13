public class lesson_19_24 {
    //Потоки ввода-вывода: цепочки потоков

    //Были классы-потоки, которые читали данные из источников данных, такие как FileInputSteam,
    //а были и промежуточные потоки данных, которые читали данные из других потоков, такие как InputStreamReader и BufferedReader.

    //Эти потоки можно было организовывать в цепочки обработки данных. Например, так:
    //FileInputStream input = new FileInputStream("c:\\readme.txt");
    //InputStreamReader reader = new InputStreamReader(input);
    //BufferedReader buff = new BufferedReader(reader);
    //String text = buff.readLine();

    //Важно отметить, что в первых нескольких строках кода мы просто конструируем цепочку из Stream-объектов,
    //но реальные данные по этой цепочке потоков еще не передаются.
    //И только когда мы вызовем метод buff.readLine(), произойдет следующее:

    //1 Объект BufferedReader вызовет метод read() у объекта InputStreamReader
    //2 Объект InputStreamReader вызовет метод read() у объекта FileInputStream
    //3 Объект FileInputStream начнет читать данные из файла

    //Т.е. никакого движения данных по цепочке потоков нет, пока мы не начали вызывать методы типа read() или readLine().
    //Само конструирование цепочки потоков данные по ним не гоняет. Потоки сами данные не хранят, а только читают из других.

    //Коллекции и потоки
    //Начиная с Java 8, появилась возможность получить поток для чтения данных у коллекций (и не только у них).
    //Но и это еще не самое интересное.
    //На самом деле появилась возможность легко и просто конструировать сложные цепочки потоков данных, при этом тот код,
    //который раньше требовал 5-10 строк, теперь можно было записать в 1-2 строки.

    //Пример — находим строку максимальной длины в списке строк:
    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "Привет", "как", "дела?");
    //String max = list.stream().max((s1, s2)-> s1.length()-s2.length()).get();

    //Равнозначен коду
    //ArrayList<String> list = new ArrayList<String>();
    //Collections.addAll(list, "Привет", "как", "дела?");
    //Stream<String> stream = list.stream();
    //Optional<String> optional = stream.max((s1, s2)-> s1.length()-s2.length());
    //String max = optional.get();
}
