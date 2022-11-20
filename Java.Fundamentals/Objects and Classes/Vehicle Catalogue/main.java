package ObjectsAndClasses.vechicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<VehicleType> catalog = new ArrayList<>();


        while (!input.equals("End")) {
            String typeOfVehicle = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            String horsepower = input.split(" ")[3];

            VehicleType vehicleType = new VehicleType(typeOfVehicle, model, color, horsepower);
            catalog.add(vehicleType);


            input = scanner.nextLine();
        }


        String models = scanner.nextLine();

        while (!models.equals("Close the Catalogue")) {
            for (VehicleType vehicle : catalog) {
                if (vehicle.getModel().equals(models)) {
                    System.out.println(vehicle);
                }
            }

            models = scanner.nextLine();
        }
        double carSum = 0;
        double truckSum = 0;
        int countCar = 0;
        int countTruck = 0;


        for (VehicleType vehicleType : catalog) {
            if (vehicleType.getTypeOFVehicle().equals("car")) {
                carSum += Double.parseDouble(vehicleType.getHorsepower());
                countCar++;
            } else if (vehicleType.getTypeOFVehicle().equals("truck")){
                truckSum += Double.parseDouble(vehicleType.getHorsepower());
                countTruck++;
            }
        }

        double averageCars = carSum / countCar;
        if(countCar == 0){
            averageCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = truckSum / countTruck;
        if(countTruck == 0){
            averageTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }
}
