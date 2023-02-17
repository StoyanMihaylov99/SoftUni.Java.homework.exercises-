package setsAndMpsAdvanced.exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class setsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int firstSize = Integer.parseInt(input.split(" ")[0]);
        int secondSize = Integer.parseInt(input.split(" ")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        fillSet(scanner, firstSize, firstSet);
        fillSet(scanner, secondSize, secondSet);


        for (int element: firstSet) {
            for (int secondElement: secondSet) {
                if(element == secondElement){
                    System.out.print(element + " ");
                }
            }
        }
    }






    private static void fillSet(Scanner scanner, int firstSize, Set<Integer> firstSet) {
        for (int i = 0; i < firstSize; i++) {
            int currentN = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentN);
        }
    }
}
