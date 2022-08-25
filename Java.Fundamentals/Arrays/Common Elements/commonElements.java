package Arrays.ArrayExercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArr [] = scanner.nextLine().split(" ");
        String secondArr [] = scanner.nextLine().split(" ");


        for (int i = 0; i <= secondArr.length - 1 ; i++) {
            for (int j = 0; j <=firstArr.length - 1 ; j++) {
                if(secondArr[i].equals(firstArr[j])) {
                    System.out.print(firstArr[j] + " ");
                }
            }
        }
    }
}
