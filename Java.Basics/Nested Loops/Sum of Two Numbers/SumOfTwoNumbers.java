package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int x1 = startInterval; x1 <= endInterval; x1++) {
            for (int x2 = startInterval; x2 <= endInterval; x2++) {
                int sum = x1 + x2;
                counter++;
                if(sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, x1,x2,sum);
                    return;
                }


            }

        }
        System.out.printf("%d combinations - neither equals %d",counter,magicNumber);
    }
}
