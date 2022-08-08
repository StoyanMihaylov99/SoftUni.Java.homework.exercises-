package MoreExersice;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double topStudents = 0;
        double between4 = 0;
        double between3 = 0;
        double fail = 0;
        double average = 0;

        int studentsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            average+=grade;
            if (grade >= 5) {
                topStudents++;

            } else if (grade >= 4) {
                between4++;
            } else if (grade >= 3) {
                between3++;
            } else {
                fail++;
            }

        }
        //Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
        //Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
        //Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
        //Ред 4 -	"Fail: {по-малко от 3.00}%"
        //Ред 5 -	"Average: {среден успех}"

        System.out.printf("Top students: %.2f%%%n", topStudents / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4 / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3 / studentsCount * 100);
        System.out.printf("Fail: %.2f%%%n", fail / studentsCount * 100);
        System.out.printf("Average: %.2f", average / studentsCount );
    }
}
