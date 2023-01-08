package stacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class basicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int elementsToPush = commands[0];
        int elementsToPop = commands[1];
        int elementsToCheck = commands[2];

        int[] stackElements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int element: stackElements) {
            stack.push(element);
        }

        for (int i = 0; i <elementsToPop ; i++) {
            stack.pop();
        }


        if(stack.isEmpty()){
            System.out.println("0");
            return;
        }

        boolean flag = false;
        if(stack.contains(elementsToCheck)){
            System.out.println("true");
            flag = true;
        }


        if(!flag){
            int smallest = Integer.MAX_VALUE;

            while (!stack.isEmpty()){
                int currentElement = stack.pop();
                if(currentElement < smallest){
                    smallest = currentElement;
                }
            }
            System.out.println(smallest);
        }







    }
}
