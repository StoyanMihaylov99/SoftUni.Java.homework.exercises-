package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double totalGradesSum = 0;
        double countGrades = 0;

        while (!input.equals("Finish")){
            String presentationName = input;
            double sumCurrentPresGrades = 0;
            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentPresGrades = sumCurrentPresGrades + grade;
            }
            totalGradesSum = totalGradesSum + sumCurrentPresGrades;
            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentPresGrades / jury);

            input = scanner.nextLine();


        }

        System.out.printf("Student's final assessment is %.2f.", totalGradesSum / countGrades);




    }
}
