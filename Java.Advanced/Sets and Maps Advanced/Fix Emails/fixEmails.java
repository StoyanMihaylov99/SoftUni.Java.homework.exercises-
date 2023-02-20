package setsAndMpsAdvanced.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> mailBox = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String name = input;
            String mail = scanner.nextLine();
            if(mail.endsWith("us") || mail.endsWith("uk") || mail.endsWith("com")){

            } else  {
                mailBox.put(name,mail);
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String, String> entry : mailBox.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(),entry.getValue());
        }

    }
}
