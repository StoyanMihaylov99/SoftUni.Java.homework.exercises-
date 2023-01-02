package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if(input == 0){
            System.out.println(input);
            return;
        }

        while (input != 0){
            stack.push(input % 2);
            input /= 2;
        }

        for (int result : stack) {
            System.out.print(stack.pop());
        }
    }
}
