package stacksAndQueues.Exercise;

import java.util.*;

public class maximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack =  new ArrayDeque<>();
        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <commands ; i++) {
            int[] currentCommand = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (currentCommand[0]){
                case 1:
                    stack.push(currentCommand[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int max = Collections.max(stack);
                    System.out.println(max);

            }
        }
    }
}
