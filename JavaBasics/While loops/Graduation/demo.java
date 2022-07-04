
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int poorGrades = 0;
        int goodGradesCounter = 0;
        int gradeCounter = 1;
        double allGrades = 0;

        while (goodGradesCounter < 12) {
            if (poorGrades == 2) {
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4) {
                poorGrades++;
                continue;
            }

            goodGradesCounter++;
            allGrades += currentGrade;
            gradeCounter++;


        }
        if(gradeCounter >= 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrades / goodGradesCounter);
        } else {
            System.out.printf("%s has been excluded at %d grade",name,gradeCounter);
        }
    }
}
