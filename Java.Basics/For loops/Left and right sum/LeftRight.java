package ForLoops;

import java.util.Scanner;

public class LeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int LeftSum = 0;
        int RightSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            LeftSum+=num;

        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            RightSum+=num;

        }
        if(LeftSum == RightSum){
            System.out.printf("Yes, sum = %d", LeftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(LeftSum - RightSum));
        }
    }
}

