package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodKG = Double.parseDouble(scanner.nextLine());
        double dogFoodNeed = Double.parseDouble(scanner.nextLine());
        double catFoodNeed = Double.parseDouble(scanner.nextLine());
        double turtleFoodNeed = Double.parseDouble(scanner.nextLine());


        double totalDog = dogFoodNeed * days;
        double totalCat = catFoodNeed * days;
        double totalTurtel = turtleFoodNeed * days;

        double totalfood = totalCat + totalDog + (totalTurtel / 1000);


        if (totalfood <= foodKG) {
            System.out.printf(" %.0f kilos of food left.", Math.floor(foodKG - totalfood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalfood - foodKG) );

        }

    }
}
