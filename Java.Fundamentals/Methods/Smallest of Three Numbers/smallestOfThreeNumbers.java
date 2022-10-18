package Methods.MethodsExercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNumber(a,b,c));

    }


    public static int smallestNumber(int a, int b, int c) {
        int number = 0;
        if (a <= b && a <= c) {
            number = a;
        } else if (b < a && b < c) {
            number = b;
        } else if (c < a && c < b) {
            number = c;
        }
        return number;
    }
}
