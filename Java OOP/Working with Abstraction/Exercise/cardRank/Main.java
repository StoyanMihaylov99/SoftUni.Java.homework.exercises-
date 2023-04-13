package WorkingWithAbstraction.Exercise.cardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        System.out.println("Card Ranks:");

        for (Ranks currentRank: Ranks.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",currentRank.ordinal(),currentRank.name());
        }
    }
}
