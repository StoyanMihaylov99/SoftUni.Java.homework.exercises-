package DefiningClasses.Car;

public class Car {

    private String model;
    private String brand;
    private int horsePower;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return "The car is: " +
                brand + " " +
                model + " - " + horsePower +
                " HP.";
    }
}
