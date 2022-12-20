package textProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder outputString = new StringBuilder(input);

        for (int i = 0; i < outputString.length() - 1; i++) {
            if(outputString.charAt(i) == outputString.charAt(i + 1)){
                outputString.deleteCharAt(i);

                i--;
            }
        }

        System.out.println(outputString);
    }
}
