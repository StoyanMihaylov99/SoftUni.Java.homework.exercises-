package Arrays.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <input.length - 1 ; i++) {
            for (int j = i + 1; j <=input.length - 1 ; j++) {
                if(input[i] + input[j] == sum){
                    System.out.print(input[i] + " " + input[j]);
                    System.out.println();
                }
            }
        }



    }
}
