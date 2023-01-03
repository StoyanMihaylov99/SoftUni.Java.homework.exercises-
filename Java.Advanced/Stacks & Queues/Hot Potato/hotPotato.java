package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] childNames = scanner.nextLine().split(" ");
        ArrayDeque<String> Queue = new ArrayDeque<>();

        for (String kid : childNames) {
            Queue.offer(kid);
        }

        int n = Integer.parseInt(scanner.nextLine());
//


        while (Queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String currentChild = Queue.poll();
                Queue.offer(currentChild);

            }

            String childRemove = Queue.poll();
            System.out.println("Removed " + childRemove);

        }

        System.out.println("Last is " + Queue.poll());

        }

    }

