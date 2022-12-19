package textProcessing.Exercise;

import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (char symbol: input.toCharArray()){
            System.out.print((char) (symbol + 3));
        }
    }
}
