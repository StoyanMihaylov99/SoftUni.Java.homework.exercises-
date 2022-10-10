package Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (input){
            case "coffee":
                coffee(quantity);
                break;
            case "water":
                water(quantity);
                break;
            case "coke":
                coke(quantity);
                break;
            case"snacks":
                snacks(quantity);
                break;
        }





    }

    public static void coffee(double a){
        System.out.printf("%.2f",a * 1.50);
    }
    public static void water(double a){
        System.out.printf("%.2f",a * 1.00);
    }
    public static void coke(double a){
        System.out.printf("%.2f", a  * 1.40);
    }
    public static void snacks(double a){
        System.out.printf("%.2f", a * 2.00);
    }



}
