package Arrays;

import java.util.Scanner;

public class dayOFWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] day = new String[7];
        day[0] = "Monday";
        day[1] = "Tuesday";
        day[2] = "Wednesday";
        day[3] = "Thursday";
        day[4] = "Friday";
        day[5] = "Saturday";
        day[6] = "Sunday";

        if(n > 0 && n <= 7) {
            System.out.println(day[n - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
