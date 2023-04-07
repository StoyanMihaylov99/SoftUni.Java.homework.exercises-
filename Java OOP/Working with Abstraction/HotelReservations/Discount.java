package WorkingWithAbstraction.HotelReservations;

public enum Discount {
    VIP(0.2), SecondVisit(0.1), None(0);



    private double Discount;

    Discount(double discount) {
        Discount = discount;
    }

    public double getDiscount() {
        return Discount;
    }
}
