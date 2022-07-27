package More;

import java.util.Scanner;

public class matchTickets {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double budget = Double.parseDouble(scanner.nextLine());
            String ticket = scanner.nextLine();
            int ppl = Integer.parseInt(scanner.nextLine());

            double left = 0;
            double priceOfTicket = 0;

            if (ppl <= 4) {
                left = budget - (budget * 0.75);
            } else if (ppl <= 9) {
                left = budget - (budget * 0.60);
            } else if (ppl <= 24) {
                left = budget - (budget * 0.50);
            } else if (ppl <= 49) {
                left = budget - (budget * 0.40);
            } else {
                left = budget - (budget * 0.25);
            }

            if (ticket.equals("Normal")) {
                priceOfTicket = 249.99 * ppl;
            } else if (ticket.equals("VIP")) {
                priceOfTicket = 499.99 * ppl;
            }

            if (priceOfTicket < left) {
                System.out.printf("Yes! You have %.2f leva left.", left - priceOfTicket);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", priceOfTicket - left);


            }
        }
    }
}