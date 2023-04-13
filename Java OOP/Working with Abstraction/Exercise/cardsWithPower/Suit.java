package WorkingWithAbstraction.Exercise.cardsWithPower;

import java.security.Signature;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }


    public static Suit parse(String string){
        return Suit.valueOf(string);
    }
}
