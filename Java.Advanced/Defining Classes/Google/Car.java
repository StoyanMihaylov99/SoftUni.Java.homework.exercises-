package DefiningClasses.Google;

public class Car {
    private String carModel;
    private int carSpeed;


    public Car(String carModel, int carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }
    public String toString() {
        return carModel + " " + carSpeed;
    }
}
