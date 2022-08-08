package MoreExersice;

import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentCargo = 0;
        double transportPriceBus = 0;
        double transportPriceTruck = 0;
        double transportPriceTrain = 0;
        double total = 0;
        double busCounter = 0;
        double TruckCounter = 0;
        double TrainbusCounter = 0;


        int cargoCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= cargoCount; i++) {
            int pieceCargo = Integer.parseInt(scanner.nextLine());
            currentCargo += pieceCargo;
            if (pieceCargo <= 3) {
                transportPriceBus += 200 * pieceCargo;
                busCounter += pieceCargo;
            } else if (pieceCargo <= 11) {
                transportPriceTruck += 175 * pieceCargo;
                TruckCounter += pieceCargo;
            } else {
                transportPriceTrain += 120 * pieceCargo;
                TrainbusCounter += pieceCargo;
            }


        }
        total = transportPriceBus + transportPriceTrain + transportPriceTruck;
        double totalTon = total / currentCargo;
        System.out.printf("%.2f%n", totalTon);
        System.out.printf("%.2f%%%n", busCounter / currentCargo * 100);
        System.out.printf("%.2f%%%n", TruckCounter / currentCargo * 100);
        System.out.printf("%.2f%%%n", TrainbusCounter/ currentCargo * 100);
        //С микробус – 4/25*100 = 16.00%
        //С камион – 5/25*100 = 20.00%
        //С влак – 16/25*100 = 64.00%

    }
}
