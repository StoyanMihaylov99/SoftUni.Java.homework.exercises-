package dataTypes;

import java.util.Scanner;

public class reverseChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char n1 = scanner.nextLine().charAt(0);
        char n2 = scanner.nextLine().charAt(0);
        char n3 = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",n3,n2,n1);


    }
}
