package setsAndMpsAdvanced;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class paringLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();


        while (!input.equals("END")){
            String direction = input.split(", ")[0];
            String carPlate = input.split(", ")[1];

            if(direction.equals("IN")){
                parkingLot.add(carPlate);
            } else {
                parkingLot.remove(carPlate);
            }


            input = scanner.nextLine();

        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car: parkingLot) {
                System.out.println(car);
            }
        }
    }
}
