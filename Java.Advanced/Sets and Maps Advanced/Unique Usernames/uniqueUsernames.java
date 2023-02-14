package setsAndMpsAdvanced.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> List = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();

            List.add(input);
        }

        for (String element: List) {
            System.out.println(element);
        }
    }
}
