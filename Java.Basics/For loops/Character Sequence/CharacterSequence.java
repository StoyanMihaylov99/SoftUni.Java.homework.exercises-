package ForLoops;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i <= input.length() - 1; i++) {
            System.out.println(input.charAt(i));
        }
    }
}
