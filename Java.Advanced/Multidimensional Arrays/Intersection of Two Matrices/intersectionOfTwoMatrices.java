package multidimensionalArrays;

import java.util.Scanner;

public class intersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());;
        int colones = Integer.parseInt(scanner.nextLine());;

        char[][] firstMatrix = new char[rows][colones];
        char[][] secondMatrix = new char[rows][colones];


        readingChar(scanner, firstMatrix);
        readingChar(scanner, secondMatrix);

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <colones ; j++) {
                if(firstMatrix[i][j] != secondMatrix[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(firstMatrix[i][j] + " ");

                }

            }
            System.out.println();
        }

    }




    private static void readingChar(Scanner scanner, char[][] firstMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {

            String string = scanner.nextLine().trim().replace(" ", "");
            firstMatrix[i] = string.toCharArray();

        }
    }
}
