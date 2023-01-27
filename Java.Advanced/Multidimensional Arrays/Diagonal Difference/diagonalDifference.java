package multidimensionalArrays.Exercises;

import java.util.Scanner;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[size][size];

        int firstSum = 0;
        int secondSum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    firstSum += matrix[row][col];
                }
            }
        }

        int elementToTake = 0;
        for (int row = size - 1; row >= 0; row--) {
            secondSum+= matrix[row][elementToTake];
            elementToTake++;

        }

        System.out.printf("%d", Math.abs(firstSum - secondSum));
    }
}
