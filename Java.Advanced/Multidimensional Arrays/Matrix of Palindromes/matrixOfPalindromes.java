package multidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class matrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[input[0]][input[1]];

        for (int rows = 0; rows <matrix.length ; rows++) {
            for (int col = 0; col <matrix[rows].length ; col++) {
                char outsideLetter = (char) ('a' + rows);
                char inside = (char) ('a' + rows + col);

                matrix[rows][col] = String.valueOf(outsideLetter) + inside + outsideLetter;
            }
        }

        for (String[] currentRow: matrix) {
            for (String currentElement: currentRow) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }
}
