package multidimensionalArrays.Exercises;

import java.util.Scanner;

public class fillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[rows][rows];
        int count = 1;

        if(type.equals("A")) {
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = count;
                    count++;
                }
            }
        } else {
            for (int col = 0; col <matrix.length ; col++) {
                if(col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = count;
                        count++;
                    }
                } else {
                    for (int row = rows - 1; row >= 0 ; row--) {
                        matrix[row][col] = count;
                        count++;
                    }
                }
            }
        }

        for (int[] arr: matrix) {
            for (int colons: arr) {
                System.out.print(colons + " ");
            }
            System.out.println();
        }

    }
}
