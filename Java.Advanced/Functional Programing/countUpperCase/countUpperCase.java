package functionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class countUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Predicate<String> isUpperCase = word -> Character.isUpperCase(word.charAt(0));
        List<String> List = new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            if(isUpperCase.test(input[i])){
                List.add(input[i]);
            }
        }

        System.out.println(List.size());
        List.forEach(element -> System.out.println(element));




    }
}
