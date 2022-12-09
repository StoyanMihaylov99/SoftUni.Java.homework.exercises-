package textProcessing.repeatStrings;

import java.util.Scanner;

public class repeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringArr = input.split(" ");

        for (int i = 0; i <= stringArr.length - 1; i++) {
            String currentWord = stringArr[i];
            for (int j = 0; j <= currentWord.length() - 1 ; j++) {
                System.out.print(currentWord);
            }
        }
    }
}
