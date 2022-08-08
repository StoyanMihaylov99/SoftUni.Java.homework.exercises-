package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class flowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoli = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double gift = Double.parseDouble(scanner.nextLine());


        double total = (magnoli * 3.25) + (zumbuli * 4.0) + (rose * 3.50) + (kaktusi *8);
        double withTax = total - (0.05 * total);

        if (withTax >= gift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(withTax - gift));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(gift - withTax));
        }
    }
}
