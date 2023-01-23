package multidimensionalArrays;

import java.util.Scanner;

public class printDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[n][n];

// reading
        for (int r = 0; r <matrix.length ; r++) {
            for (int c = 0; c <matrix.length ; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
// first diagonal
        for (int i = 0; i <matrix.length ; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        // second diagonal
        int x = matrix.length - 1;
        int y = 0;

        for (int i = 0; i <matrix.length ; i++) {

            System.out.print(matrix[x][y] + " ");
            x--;
            y++;
        }

    }
}
