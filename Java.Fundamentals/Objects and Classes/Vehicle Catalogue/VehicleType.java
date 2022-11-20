package ObjectsAndClasses.vechicleCatalogue;

import java.sql.SQLOutput;

public class VehicleType {

    String typeOFVehicle;
    String model;
    String color;
    String horsepower;

    public VehicleType(String typeOFVehicle, String model, String color, String horsepower) {
        this.typeOFVehicle = typeOFVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }


    public String getColor() {
        return color;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOFVehicle() {
        return typeOFVehicle;
    }


    public String toString() {
        String formattedTpe = "";
        if(this.typeOFVehicle.equals("car")){
            formattedTpe = "Car";
        } else {
            formattedTpe = "Truck";
        }
        return "Type: " + formattedTpe + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsepower;
    }
}
