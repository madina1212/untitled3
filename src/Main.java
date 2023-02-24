import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Car2.M5, LocalDate.of(2015, 3, 6), 180000, Car3.CROSSOVER);
        Car car1 = new Car(Car2.SERIES_1, LocalDate.of(1991, 3, 19), 220000, Car3.SUV);
        Car car2 = new Car(Car2.SERIES_5, LocalDate.of(2001, 6, 31), 130000, Car3.HATCHBACK);
        Car car3 = new Car(Car2.M3, LocalDate.of(1998, 5, 28), 100000, Car3.SEDAN);
        Car car4 = new Car(Car2.UNKNOWN, LocalDate.of(2022, 12, 9), 250000, Car3.UNIVERSAL);
        Car[] cars = {car, car1, car2, car3, car4};
        determinationoYearOfManufacture(cars);
    }

    public static void determinationoYearOfManufacture(Car[]cars){
        for (Car ca:cars) {
            System.out.println(ca.getCarModel()+" " + Period.between(ca.getLocalDate(),LocalDate.now()).getYears());
        }
    }
}