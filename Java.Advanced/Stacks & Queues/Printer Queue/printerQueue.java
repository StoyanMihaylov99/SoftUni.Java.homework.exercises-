package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class printerQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> files = new ArrayDeque<>();


        while (!command.equals("print")){
            if(command.equals("cancel")){

                if(files.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + files.poll());
                }
            } else {
                files.offer(command);

            }

            command  = scanner.nextLine();
        }

        for (String file:files) {
            System.out.println(file);
        }
    }
}
