package Arrays.ArrayExercise;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        String[] fistArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                fistArr[i - 1] = input[1];
                secondArr[i - 1] = input[0];
            } else {
                fistArr[i - 1] = input[0];
                secondArr[i - 1] = input[1];
            }
        }
        for (String first : fistArr) {
            System.out.print(first + " ");

        }
        System.out.println();
        for (String second : secondArr) {
            System.out.print(second + " ");

        }

    }
}
