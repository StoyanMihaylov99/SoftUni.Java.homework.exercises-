package ForLoopsExersice;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int MaxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i += 1) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if(MaxNumber < currentNumber){
                MaxNumber = currentNumber;
            }
        }
        int sumWithout = sum - MaxNumber;
        if(sumWithout == MaxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d",MaxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(MaxNumber - sumWithout));
        }
    }
}
