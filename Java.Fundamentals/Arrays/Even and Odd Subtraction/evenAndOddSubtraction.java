package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class evenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            } else {
                oddSum += numArr[i];
            }

        }

        System.out.println(evenSum - oddSum);

    }
}
