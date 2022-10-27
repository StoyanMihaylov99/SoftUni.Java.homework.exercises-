package Methods.MethodsExercise;

import java.util.Scanner;
import java.util.Arrays;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] Arr = input.split("");
            int[] arrNumber = new int[Arr.length];
            for (int i = 0; i < arrNumber.length; i++) {
                arrNumber[i] = Integer.parseInt(Arr[i]);


            }
            if (arrNumber[0] == arrNumber[arrNumber.length - 1]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();

        }
    }
}

   /* public static void palindromeIntegers(String input) {
        while (!input.equals("END")) {
            Scanner scanner = new Scanner(System.in);
            String[] Arr = input.split("");
            int[] arrNumber = new int[Arr.length];
            for (int i = 0; i < arrNumber.length; i++) {
                arrNumber[i] = Integer.parseInt(Arr[i]);


            }
            if (arrNumber[0] == arrNumber[arrNumber.length - 1]) {

                System.out.println("true");
            } else {
                System.out.println("false");

            }
            input = scanner.nextLine();
        }

    }
} */
