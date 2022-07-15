package NestedLoops;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while(!destination.equals("End")){
            double NeededMoney = Double.parseDouble(scanner.nextLine());
            double saved = 0;
            while(saved < NeededMoney){
                double sum = Double.parseDouble(scanner.nextLine());
                saved += sum;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();

        }
    }
}
