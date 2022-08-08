package ForLoopsExersice;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double WashingMachine = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int money = 0;
        int brother = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    money = 10;
                } else {
                    money += 10.00 * i / 2;
                }
                brother++;
            } else {
                toys++;

            }
        }
        double toysMoney = toys * toysPrice;
        double totalMoney = money + toysMoney - brother;

        if (WashingMachine <= totalMoney) {
            System.out.printf("Yes! %.2f", totalMoney - WashingMachine);
        } else {
            System.out.printf("No! %.2f", WashingMachine - totalMoney);
        }
    }
}
