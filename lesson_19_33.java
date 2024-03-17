import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class lesson_19_33 {
    //Современный мир отказывается от двигателей внутреннего сгорания, и эра электрокаров не за горами.
    //Нужно, чтобы наша программа могла отфильтровать электрокары от всех остальных автомобилей.
    //Для этих целей есть метод onlyElectricCars(ArrayList<Car>), который фильтрует список автомобилей,
    //получаемых в качестве входящего параметра. Этот метод возвращает поток отфильтрованных данных, а именно — поток автомобилей,
    //у которых поле isElectric равно true. В этом тебе поможет метод filter() объекта типа Stream<Car>.
    public static void main(String[] args) {
        var cars = new ArrayList<Cars>();
        Collections.addAll(cars,
                new Cars("Range Rover", false),
                new Cars("Model S", true),
                new Cars("Navigator", false),
                new Cars("Model 3", true),
                new Cars("Camaro", false),
                new Cars("Escalade", false),
                new Cars("Mustang", false),
                new Cars("Model X", true),
                new Cars("X5", false),
                new Cars("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Cars> onlyElectricCars(ArrayList<Cars> cars) {
        return cars.stream()
                .filter(Cars::isElectric);
    }
}

class Cars {
    private String model;
    private boolean isElectric;

    public Cars(String model, boolean isElectric) {
        this.model = model;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public String toString() {
        return "Car " + model + ", electric - " + isElectric;
    }
}
