package WhileLoops;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String password2 = scanner.nextLine();

        if(password2.equals(password)){
            System.out.println("Welcome " + username + "!");
        }

    }
}
