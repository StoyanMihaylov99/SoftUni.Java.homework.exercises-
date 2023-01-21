package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        int[][] matrix = new int[input[0]][input[1]];

        for (int rows = 0; rows <matrix.length; rows++) {
            String[] inputLine = scanner.nextLine().split(", ");
            for (int colones = 0; colones < matrix[rows].length; colones++) {
                int currentElement = Integer.parseInt(inputLine[colones]);
                matrix[rows][colones] = currentElement;
                sum += currentElement;
            }
        }



        System.out.println(matrix.length);
        System.out.println(input[1]);
        System.out.println(sum);

    }
}
