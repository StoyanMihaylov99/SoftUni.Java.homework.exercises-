package stacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = scanner.nextLine();
        int countElement = Integer.parseInt(commands.split(" ")[0]);
        int removeElement = Integer.parseInt(commands.split(" ")[1]);
        int checkElement = Integer.parseInt(commands.split(" ")[2]);

        ArrayDeque<Integer> Queue = new ArrayDeque<>();

        String[] queueString = scanner.nextLine().split(" ");

        for (int i = 0; i <countElement ; i++) {
            int currentElement = Integer.parseInt(queueString[i]);
            Queue.offer(currentElement);
        }

        for (int i = 0; i <removeElement ; i++) {
            Queue.poll();
        }

        if(Queue.isEmpty()){
            System.out.println("0");
            return;
        }

        if(Queue.contains(checkElement)){
            System.out.println("true");
        } else {
            System.out.print(Collections.min(Queue));
        }

    }
}
