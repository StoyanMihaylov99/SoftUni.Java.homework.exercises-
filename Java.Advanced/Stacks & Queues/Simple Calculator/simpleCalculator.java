package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack =  new ArrayDeque<>();


        for (int i = elements.length - 1; i >= 0 ; i--) {
            stack.push(elements[i]);
        }
        int result = Integer.parseInt(stack.pop());

        while (!stack.isEmpty()){
            if(stack.pop().equals("+")){
                result += Integer.parseInt(stack.pop());
            } else {
                result -= Integer.parseInt(stack.pop());
            }
        }

        System.out.println(result);

    }
}
