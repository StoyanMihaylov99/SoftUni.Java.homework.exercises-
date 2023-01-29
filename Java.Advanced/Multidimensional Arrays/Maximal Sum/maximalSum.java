package multidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class maximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int bestStartingRow = 0;
        int bestStartingCol = 0;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if(sum > maxSum){
                    maxSum = sum;
                    bestStartingCol = col;
                    bestStartingRow = row;
                }

            }
        }

        System.out.println("Sum = " + maxSum);

        for (int i = bestStartingRow; i <bestStartingRow + 3 ; i++) {
            for (int j = bestStartingCol; j <bestStartingCol + 3 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }



    }
}
