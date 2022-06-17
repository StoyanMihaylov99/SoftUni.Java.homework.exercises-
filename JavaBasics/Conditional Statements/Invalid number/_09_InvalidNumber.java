package conditionalStatementsAdvanced;

import java.util.Scanner;

public class _09_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        //е в диапазона [100…200] или е 0
        if (number >= 100 && number <= 200 || number == 0) {
        } else {
            System.out.println("invalid");
        }
    }
}
