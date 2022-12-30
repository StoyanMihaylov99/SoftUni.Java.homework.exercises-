package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if(stack.size() <= 1){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
                stack.pop();
                System.out.println(stack.peek());

            } else {
                stack.push(input);
                System.out.println(stack.peek());

            }

            input = scanner.nextLine();
        }
    }
}
