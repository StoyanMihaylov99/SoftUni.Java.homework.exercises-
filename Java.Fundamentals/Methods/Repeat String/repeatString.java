package Methods;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        forLoop(input,rows);


    }
    public static String forLoop(String text, int number){
        for (int i = 1; i <=number ; i++) {
            System.out.print(text);

        }
        return text;
    }
}

