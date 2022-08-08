package MoreExersice;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int visited = 0;
        int untVisited = 0;
        for (int i = 1; i <= days; i++) {
            int patientsForToday = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && visited < untVisited){
                doctors++;
            }
                if (patientsForToday > doctors) {
                    untVisited+=patientsForToday - doctors;
                    visited+= doctors;
                } else {
                    visited+=patientsForToday;
                }


        }
        System.out.printf("Treated patients: %d.%n", visited);
        System.out.printf("Untreated patients: %d.", untVisited);
    }
}
