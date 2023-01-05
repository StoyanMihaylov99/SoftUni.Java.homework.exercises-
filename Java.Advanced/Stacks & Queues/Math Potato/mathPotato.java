package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] childNames = scanner.nextLine().split(" ");
        ArrayDeque<String> Queue = new ArrayDeque<>();

        for (String kid : childNames) {
            Queue.offer(kid);
        }

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (Queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String currentChild = Queue.poll();
                Queue.offer(currentChild);

            }
            counter++;
            if(isPrime(counter)){
                System.out.println("Prime " + Queue.peek());
            } else {
                System.out.println("Removed " + Queue.poll());
            }

        }

        System.out.println("Last is " + Queue.poll());



    }


    private static boolean isPrime(int counter){
        if(counter <= 1){
            return false;
        }
        for(int i = 2; i<= counter / 2; i++){
            if((counter % i) == 0)
                return  false;
        }
        return true;
    }
}
