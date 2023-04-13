package WorkingWithAbstraction.Exercise.cardsWithPower;

public class Card {
    Rank cardRank;
    Suit cardSuits;


    public Card(Rank cardRank, Suit cardSuits) {
        this.cardRank = cardRank;
        this.cardSuits = cardSuits;

    }

    public int getCardPower() {
        return cardRank.getPower() + cardSuits.getPower();
    }
}
