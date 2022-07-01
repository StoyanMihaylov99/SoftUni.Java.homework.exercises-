package WhileLoops;

import java.util.Scanner;

public class AcountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            double input0 = Double.parseDouble(input);
            if (input0 < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += input0;
            System.out.printf("Increase: %.2f%n", input0);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
