package DefiningClasses.speedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carList = new LinkedHashMap<>();

        for (int i = 0; i <cars ; i++) {
            String[] carData = scanner.nextLine().split(" ");

            String model = carData[0];
            double fuelAmount = Double.parseDouble(carData[1]);
            double fuelPerKm = Double.parseDouble(carData[2]);
            int traveled = 0;
            Car car = new Car(model,fuelAmount,fuelPerKm,traveled);
            carList.put(model,car);
        }


        String command = scanner.nextLine();

        while (!command.equals("End")){
            String carModelToDrive = command.split(" ")[1];
            int kmAmountToDrive = Integer.parseInt(command.split(" ")[2]);

            Car carToDrive = carList.get(carModelToDrive);
            if(!carToDrive.CanItDrive(kmAmountToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        for (Car car : carList.values()) {
            System.out.println(car.toString());

        }


    }
}
