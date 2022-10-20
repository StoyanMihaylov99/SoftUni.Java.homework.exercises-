package Methods.MethodsExercise;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        chars(a,b);


    }

    private static void chars(char a, char b) {
        int firstInput = (int)a;
        int secondInput = (int)b;

        int startCharacter = Math.min(firstInput,secondInput);
        int endCharacter = Math.max(firstInput,secondInput);

        for (int i = startCharacter + 1; i < endCharacter ; i++) {
            char current = (char)i;
            System.out.print(current + " ");
        }
    }
}
