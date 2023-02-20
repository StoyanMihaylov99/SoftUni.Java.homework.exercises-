package setsAndMpsAdvanced.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class phoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phoneBook = new TreeMap<>();

        while (!input.equals("search")){
            String name = input.split("-")[0];
            String phone = input.split("-")[1];

           phoneBook.putIfAbsent(name,phone);

            input = scanner.nextLine();

        }


        String search = scanner.nextLine();

        while (!search.equals("stop")) {

            if(phoneBook.containsKey(search)) {

                System.out.printf("%s -> %s%n", search, phoneBook.get(search));
            } else {
                System.out.println("Contact " + search + " does not exist.");
            }



            search = scanner.nextLine();
        }
    }
}
