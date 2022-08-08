package MoreExersice;
import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int turns = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double counter9 =0;
        double counter19 =0;
        double counter29 =0;
        double counter39 =0;
        double counter50 =0;
        double invalid=0;

        for (int i = 1; i <= turns; i++) {
            int currentTurn = Integer.parseInt(scanner.nextLine());
            if (currentTurn < 0) {
                invalid++;
                points /= 2;
            } else if (currentTurn <= 9) {
                counter9++;
                points += currentTurn * 0.20;
            } else if (currentTurn <= 19) {
                counter19++;
                points += currentTurn * 0.30;
            } else if (currentTurn <= 29) {
                counter29++;
                points += currentTurn * 0.40;
            } else if (currentTurn <= 39) {
                counter39++;
                points += 50;
            } else if (currentTurn <= 50) {
                counter50++;
                points += 100;
            } else {
                points /= 2;
                invalid++;
            }


        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", counter9 / turns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", counter19 / turns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", counter29 / turns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", counter39 / turns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", counter50 / turns * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid / turns * 100);


    }
}
