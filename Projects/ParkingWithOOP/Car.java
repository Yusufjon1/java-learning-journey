package Projects.ParkingWithOOP;

public class Car {

    public String carNumber;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                '}';
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }
}
