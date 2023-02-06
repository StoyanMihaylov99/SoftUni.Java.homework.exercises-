package setsAndMpsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class voina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] firstDeck = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondDeck = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        LinkedHashSet<Integer> firstHand = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondHand = new LinkedHashSet<>();

        fillDeck(firstDeck, firstHand);
        fillDeck(secondDeck, secondHand);

        int round = 1;
        boolean flag = false;

        for (int i = 0; i < 50; i++) {


            int firstNumber = firstHand.iterator().next();
            int secondNumber = secondHand.iterator().next();

            firstHand.remove(firstNumber);
            secondHand.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstHand.add(firstNumber);
                firstHand.add(secondNumber);
            } else if (secondNumber > firstNumber) {
                secondHand.add(firstNumber);
                secondHand.add(secondNumber);
            }

            if (firstHand.isEmpty()) {
                System.out.println("Second player win!");
                flag = true;
            } else if (secondHand.isEmpty()) {
                System.out.println("First player win!");
                flag = true;
            }

        }


        if(!flag){
            if(firstHand.size() > secondHand.size()){
                System.out.println("First player win!");
            } else if(secondHand.size() > firstHand.size()) {
                System.out.println("Second player win!");
            } else {
                System.out.println("Draw!");
            }
        }







    }











    private static void fillDeck(int[] firstDeck, LinkedHashSet<Integer> firstHand) {
        for (int i = 0; i < firstDeck.length ; i++) {
            firstHand.add(firstDeck[i]);
        }
    }
}
