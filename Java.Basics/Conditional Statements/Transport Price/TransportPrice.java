package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int KM = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double price = 0;
        double taxiRate = 0;


        if (dayOrNight.equals("day")) {
            taxiRate = 0.79;
        } else if (dayOrNight.equals("night")) {
            taxiRate = 0.90;
        }

        if (KM < 20) {
            price = 0.70 + (KM * taxiRate);
        } else if (KM < 100) {
            price = 0.09 * KM;
        } else {
            price = 0.06 * KM;
        }
        System.out.printf("%.2f", price);
    }
}
