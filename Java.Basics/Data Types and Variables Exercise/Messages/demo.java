import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfInputs; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            //Find the number of digits the input has “e.g. 222  3 digits”
            int numOfDigits = Integer.toString(input).length();

            //Find the main digit of the input “e.g.  222  2”
            int mainDigit = input % 10;

            //Find the offset of the number
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) offset++;

            //Find the letter index
            int letterIndex = offset + numOfDigits - 1;

            //and add that to the ASCII code of the lowercase letter “a” (97)
            if (mainDigit == 0) {
                message += " ";
            } else {
                message += String.valueOf(Character.toChars(letterIndex + 97));
            }
        }
        System.out.println(message);
    }
}

