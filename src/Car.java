import java.time.LocalDate;

public class Car {
    private Car2 carModel;
    private LocalDate localDate;
    private int price;
    private Car3 bodyType;

    public Car(Car2 carModel, LocalDate localDate, int price, Car3 bodyType) {
        this.carModel = carModel;
        this.localDate = localDate;
        this.price = price;
        this.bodyType = bodyType;
    }

    public Car2 getCarModel() {
        return carModel;
    }

    public void setCarModel(Car2 carModel) {
        this.carModel = carModel;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car3 getBodyType() {
        return bodyType;
    }

    public void setBodyType(Car3 bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", localDate=" + localDate +
                ", price=" + price +
                ", bodyType=" + bodyType +
                '}';
    }
}
