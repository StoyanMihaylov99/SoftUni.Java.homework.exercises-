package textProcessing.Exercise;

import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String first = input[0];
        String second = input[1];

        int minLength = Math.min(first.length(), second.length());
        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += first.charAt(i) * second.charAt(i);
        }


        if (first.length() > second.length()) {
            for (int i = minLength; i < first.length(); i++) {
                sum += first.charAt(i);
            }
        } else {
            for (int i = minLength; i < second.length(); i++) {
                sum += second.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
