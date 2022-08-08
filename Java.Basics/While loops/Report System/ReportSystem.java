package MoreExersice;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double counter = 0;
         double cash = 0;
         double card = 0;
         double cashCounter = 0;
        double cardCounter = 0;

        int EstimatedSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            int currentSum = Integer.parseInt(input);
            counter++;
            if (counter % 2 == 0) {
                if (currentSum < 10) {
                    System.out.println("Error in transaction!");

                } else {
                    card += currentSum;
                    cardCounter++;
                    System.out.printf("Product sold!%n");
                }
            } else {
                if (currentSum > 100) {
                    System.out.println("Error in transaction!");

                } else {
                    cash += currentSum;
                    cashCounter++;
                    System.out.printf("Product sold!%n");
                }
            }

            if(EstimatedSum<= cash + card){
                System.out.printf("Average CS: %.2f%n", cash/cashCounter);
                System.out.printf("Average CC: %.2f", card/cardCounter);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.println("Failed to collect required money for charity.");
    }
}
