package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;
        int counter = 0;

        String movies = scanner.nextLine();
        int currentCounter = 0;
        while (!movies.equals("Finish")){
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String input = scanner.nextLine();
            while (!input.equals("End")) {
                counter++;
                currentCounter++;
                switch (input) {
                    case "standard":
                        counterStandard++;
                        break;
                    case "student":
                        counterStudent++;
                        break;
                    case "kid":
                        counterKid++;
                        break;
                }
                if (currentCounter == freeSeats) {
                    break;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movies, currentCounter * 1.00 / freeSeats * 100);

            movies = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", counter);
        System.out.printf("%.2f%% student tickets.%n", counterStudent * 1.00 / counter * 100);
        System.out.printf("%.2f%% standard tickets.%n", counterStandard * 1.00 / counter * 100);
        System.out.printf("%.2f%% kids tickets.", counterKid * 1.00 / counter * 100);
    }
}
