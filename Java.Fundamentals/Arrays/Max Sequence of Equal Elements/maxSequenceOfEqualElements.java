package Arrays.ArrayExercise;

import java.util.Scanner;
import java.util.Arrays;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxLength = 0;
        int start = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                length++;
                if(length>maxLength){
                    maxLength = length;
                    start = numbers[i];

                }
            } else {
                length = 1;
            }
        }
        for (int j = 0; j <maxLength ; j++) {
            System.out.print(start + " ");
        }
    }
}
