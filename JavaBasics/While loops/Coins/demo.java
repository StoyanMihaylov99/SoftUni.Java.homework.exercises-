import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int coinsCounter = 0;
        double coins = change * 100;

        while (coins != 0) {
            if (coins >= 200) {
                coins -= 200;
                coinsCounter++;
            } else if (coins >= 100) {
                coins -= 100;
                coinsCounter++;
            } else if (coins >= 50) {
                coins -= 50;
                coinsCounter++;
            } else if (coins >= 20) {
                coins -= 20;
                coinsCounter++;
            } else if (coins >= 10) {
                coins -= 10;
                coinsCounter++;
            } else if (coins >= 5) {
                coins -= 5;
                coinsCounter++;
            } else if (coins >= 2) {
                coins -= 2;
                coinsCounter++;
            } else if (coins >= 1) {
                coins -= 1;
                coinsCounter++;
            } else {
                break;
            }

        }
        System.out.println(coinsCounter);
    }
}