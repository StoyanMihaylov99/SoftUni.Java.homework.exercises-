package ObjectsAndClasses.advertisementMessage;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    Message message = new Message();
    int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
            String output = message.randomMessenge();
            System.out.println(output);
        }
    }
}
