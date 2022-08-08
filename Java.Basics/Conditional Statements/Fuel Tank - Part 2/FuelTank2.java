package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        double volume = Double.parseDouble(scanner.nextLine());
        String discount = scanner.nextLine();


        double gasoline = 2.22;
        double diesel = 2.33;
        double gas = 0.93;
        double moreDiscount = 0;

        if (discount.equals("Yes")) {
            gasoline = gasoline - 0.18;
            diesel = diesel - 0.12;
            gas = gas - 0.08;
        }
        double totalSum = 0;
        switch (fuel) {
            case "Gasoline":
                totalSum = gasoline * volume;
                break;
            case "Diesel":
                totalSum = diesel * volume;
                break;
            case "Gas":
                totalSum = gas * volume;
                break;
            default:
        }

        if (volume >= 20 && volume <= 25) {
            totalSum = totalSum - (totalSum * 0.08);
        } else if (volume > 25) {
            totalSum = totalSum - (totalSum * 0.10);
        }
        System.out.printf("%.2f lv.",totalSum);
    }


}



