package MoreExersice;

import java.util.Scanner;

public class DishWash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottleCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        int pots = 0;
        int potsCounter = 0;
        int plates = 0;
        int platesCounter = 0;

        int quantity = bottleCount * 750;
        while (!input.equals("End")) {
            counter++;
            int dishes = Integer.parseInt(input);
            if (counter % 3 == 0) {
                pots = dishes * 15;
                quantity -= pots;
                potsCounter += Integer.parseInt(input);

            }
            if(counter % 3 != 0){
             plates = dishes * 5;
            platesCounter += Integer.parseInt(input);
            quantity -= plates;}
if(quantity<0){
    System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(quantity));
    return;
}

            input = scanner.nextLine();
        }
        if(quantity>=0){
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", platesCounter,potsCounter);
            System.out.printf("Leftover detergent %d ml.",quantity);
        }
        }

    }
