package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double GrapeMeter = Double.parseDouble(scanner.nextLine());
        int VineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double total = area * GrapeMeter;
        double totalVine = (0.40 * total) / 2.5;

        if (totalVine >= VineNeeded){
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n %.0f liters left -> %.0f liters per person.", Math.floor(totalVine), Math.ceil(totalVine - VineNeeded), Math.ceil(Math.ceil(totalVine - VineNeeded) / workers));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(VineNeeded - totalVine));
        }


    }
}
