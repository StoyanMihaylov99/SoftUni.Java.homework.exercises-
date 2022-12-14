package textProcessing.Exercise;

import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] inputData = input.split(", ");

        for (String currentString : inputData) {

            if(isValid(currentString)) {
                System.out.println(currentString);
            }
        }
    }

    private static boolean isValid(String text) {
        if (text.length() < 3 || text.length() > 16) {
            return false;

        }

        for (char symbol: text.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;
    }
}
