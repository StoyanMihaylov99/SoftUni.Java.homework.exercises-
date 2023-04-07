package WorkingWithAbstraction.HotelReservations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        Double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        Discount discount = Discount.valueOf(input[3]);


        System.out.printf("%.2f",PriceCalculator.calculatePrice(pricePerDay,days,season,discount));


    }
}
