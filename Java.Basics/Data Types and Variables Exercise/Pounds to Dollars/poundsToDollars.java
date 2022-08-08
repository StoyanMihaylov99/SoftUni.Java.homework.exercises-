package dataTypes;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        double dollars = input * 1.36;
        System.out.printf("%.3f", dollars);



    }
}
