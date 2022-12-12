package textProcessing.DigitsLettersAndOther;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String letters = "";
        String numbers = "";
        String symbols = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                numbers += currentChar;
            } else if (Character.isLetter(currentChar)) {
                letters += currentChar;
            } else {
                symbols += currentChar;
            }

        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
