package Arrays.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index <= input.length - 1; index++) {
            int currentElement = input[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum+=input[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex <= input.length - 1 ; rightIndex++) {
                rightSum += input[rightIndex];
            }

            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;

            }
        }
        if(!isFound){
        System.out.println("no");}
    }
}
