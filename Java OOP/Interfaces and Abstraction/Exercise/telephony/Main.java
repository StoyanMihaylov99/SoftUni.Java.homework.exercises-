package telephony;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbers = scanner.nextLine().split(" ");
        String[] urlLinks = scanner.nextLine().split(" ");


        Smartphone smartphone = new Smartphone(Arrays.asList(phoneNumbers),Arrays.asList(urlLinks));
        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());


    }
}
