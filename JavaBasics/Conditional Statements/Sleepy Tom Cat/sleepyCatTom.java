package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class sleepyCatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - daysOff;
        int totalMin = (daysOff * 127) + (workDays * 63);
        int slpForYear = 0;
         int minsToHours = 0;
         int minsToMinutes = 0;

        if (totalMin >= 30000) {
            slpForYear = totalMin - 30000;
             minsToHours = slpForYear / 60;
             minsToMinutes = slpForYear % 60;
            System.out.printf("Tom will run away %n " +
                    "%d hours and %d minutes more for play", minsToHours, minsToMinutes); }
        else {
            slpForYear = 30000 - totalMin;
            minsToHours = slpForYear / 60;
            minsToMinutes = slpForYear % 60;
            System.out.printf("Tom sleeps well %n" +
                    "%d hours and %d minutes less for play", minsToHours, minsToMinutes);
        }
        }

    }

