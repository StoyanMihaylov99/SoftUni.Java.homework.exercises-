package DefiningClasses.speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelPerKm, int distanceTraveled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKm = fuelPerKm;
        this.distanceTraveled = distanceTraveled;
    }

    public String getModel() {
        return model;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelPerKm(int fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean CanItDrive(int kmToDrive) {
        double needFuel = kmToDrive * this.fuelPerKm;
        if (needFuel <= this.fuelAmount) {
            this.fuelAmount -= needFuel;
            this.distanceTraveled += kmToDrive;
            return true;
        }

        return false;
    }


    @Override
    public String toString() {
         return String.format("%s %.2f %d", model, fuelAmount, distanceTraveled);
    }
}

