package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class positionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int colones = input[1];

        int[][] matrix = new int[rows][colones];


        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {

                matrix[r][c] = scanner.nextInt();
            }

        }

        int number = scanner.nextInt();

        boolean flag = false;
        for (int r = 0; r < matrix.length; r++) {
            for (int col = 0; col < matrix[r].length; col++) {
                if (matrix[r][col] == number) {
                    System.out.println(r + " " + col);
                    flag = true;
                }
            }
        }

        if(!flag) {
            System.out.println("not found");
        }

    }
}
