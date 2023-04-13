package WorkingWithAbstraction.Exercise.cardSuit;

import WorkingWithAbstraction.Exercise.cardSuit.cards;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Card Suits:");

        for (cards card: cards.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(),card.name());
        }
    }
}
