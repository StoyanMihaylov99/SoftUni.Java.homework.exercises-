package stacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();


        for (int i = 0; i < n; i++) {
            String[] currentInput = scanner.nextLine().split(" ");

            int currentCommand = Integer.parseInt(currentInput[0]);

            switch (currentCommand) {
                case 1:
                   String argument = currentInput[1];
                   stack.push(text.toString());
                   text.append(argument);

                    break;

                case 2:
                    int countToRemove = Integer.parseInt(currentInput[1]);
                    stack.push(text.toString());
                    text = new StringBuilder(text.delete(text.length() - countToRemove,text.length()));

                    break;
                case 3:
                   int index = Integer.parseInt(currentInput[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case 4:
                    text = new StringBuilder(stack.pop());

                    break;
            }


        }
    }
}
