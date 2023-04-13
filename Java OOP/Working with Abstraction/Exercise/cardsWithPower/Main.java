package WorkingWithAbstraction.Exercise.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rank cardRank = Rank.parse(scanner.nextLine());
        Suit cardSuit = Suit.parse(scanner.nextLine());

        Card card = new Card(cardRank,cardSuit);

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank.name(),cardSuit.name(),card.getCardPower());


    }
}
