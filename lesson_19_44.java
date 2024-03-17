import java.util.Optional;
import java.util.stream.Stream;
public class lesson_19_44 {
    //У автомобиля, представленного классом Auto, есть две характеристики: название - поле name, цена - поле price.

    //В классе lesson_19_44 выполняются две операции поиска:
    //метод getMostExpensiveAuto(Stream<Auto>) ищет самый дорогой автомобиль в одном списке;
    //метод getMoreExpensiveAuto(Stream<Auto>, Auto) в другом списке ищет автомобиль дороже,
    //чем полученный в методе getMostExpensiveAuto(Stream<Auto>).
    //Методы возвращают не сам автомобиль (объект типа Auto), а объект типа Optional<Auto>.


    public static void main(String[] args) {
        var tesla = Stream.of(
                new Auto("Model S", 94_490),
                new Auto("Model 3", 50_690),
                new Auto("Model X", 99_690),
                new Auto("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Auto("X5", 110_000),
                new Auto("X3", 54_000),
                new Auto("X7", 143_000),
                new Auto("X6", 125_000)
        );

        Optional<Auto> mostExpensiveAuto = getMostExpensiveAuto(tesla);
        mostExpensiveAuto.ifPresent(System.out::println);

        Optional<Auto> moreExpensiveAuto = mostExpensiveAuto.flatMap(car -> getMoreExpensiveAuto(bmw, car));
        moreExpensiveAuto.ifPresent(System.out::println);
    }

    public static Optional<Auto> getMostExpensiveAuto(Stream<Auto> cars) {
        return cars.max((car1,car2) -> car1.getPrice()-car2.getPrice());
    }

    public static Optional<Auto> getMoreExpensiveAuto(Stream<Auto> cars, Auto mostExpensiveAuto) {
        return cars.filter(car -> mostExpensiveAuto.getPrice() < car.getPrice()).findFirst();
    }
}
class Auto {
    private String name;
    private Integer price;

    public Auto(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
