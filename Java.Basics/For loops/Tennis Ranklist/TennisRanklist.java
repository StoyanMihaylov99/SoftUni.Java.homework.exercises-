package ForLoopsExersice;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCompetition = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int pointsWinOrLose = 0;
        int averagePoints =0;
        double countwin = 0;

        for (int i = 1; i <= countCompetition; i++) {
            String winOrLose = scanner.nextLine();
            if (winOrLose.equals("W")) {
                pointsWinOrLose = 2000;
                countwin += 1;
            } else if (winOrLose.equals("F")) {
                pointsWinOrLose = 1200;
            } else if (winOrLose.equals("SF")) {
                pointsWinOrLose = 720;
            }
            startPoints = startPoints + pointsWinOrLose;
            averagePoints += pointsWinOrLose;
        }
        averagePoints = averagePoints / countCompetition;
        double percent = (countwin / countCompetition) * 100;

        System.out.printf("Final points: %d%n",startPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%",percent);
    }

}
