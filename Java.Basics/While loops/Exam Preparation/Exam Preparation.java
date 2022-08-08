import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double countAllGrades = 0;
        double sumAllGrades = 0;
        String lastProblem = "";
        while (count < badGrades) {
            String tittle = scanner.nextLine();
            if (tittle.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", sumAllGrades / countAllGrades);
                System.out.printf("Number of problems: %.0f%n", countAllGrades);
                System.out.printf("Last problem: %s", lastProblem);
                return;
            }
            lastProblem = tittle;
            countAllGrades++;
            int grade = Integer.parseInt(scanner.nextLine());
            sumAllGrades += grade;
            if (grade <= 4) {
                count++;
            }
        }
        System.out.printf("You need a break, %d poor grades.", count);


    }
}