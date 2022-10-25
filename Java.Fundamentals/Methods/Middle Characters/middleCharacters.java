package Methods.MethodsExercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printMiddle(input);



    }

    public static void printMiddle(String text){
        if(text.length() % 2 == 0){
            int indexFirstMiddle = text.length() / 2 - 1;
            int indexSecondMiddle = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddle) + "" + text.charAt(indexSecondMiddle));
        } else {
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
