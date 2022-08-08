package conditionalStatementsAdvanced;

import java.util.Scanner;

public class _07_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int price = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
                price = 12;
                break;
            case "Wednesday":
            case "Thursday":
                price = 14;
                break;
            case "Friday":
                price = 12;
                break;
            case "Saturday":
            case "Sunday":
                price = 16;
                break;
        }
        System.out.println(price);
    }
}
