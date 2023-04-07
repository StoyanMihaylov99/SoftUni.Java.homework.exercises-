package WorkingWithAbstraction.HotelReservations;

public enum Season {
    Spring(2), Summer(4), Autumn(1), Winter(3);


private int multiplier;


    Season(int multiplier) {
        this.multiplier = multiplier;
    }


    public int getMultiplier() {
        return multiplier;
    }


}
