package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(input.length > 1){

            int[] condensed = new int[input.length - 1];

            for (int i = 0; i <condensed.length - 1; i++) {

                condensed[i] = input[i] + input[i + 1];
            }
            input = condensed;
        }
        System.out.println(input[0]);
    }
}
