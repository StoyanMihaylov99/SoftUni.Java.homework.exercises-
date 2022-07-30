package MoreExersice;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double number = 0;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            number+= input;

        }
        System.out.printf("%.2f", number/n);


    }
}
