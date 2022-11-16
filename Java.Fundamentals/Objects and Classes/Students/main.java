package ObjectsAndClasses.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Students> StudentList= new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String line = scanner.nextLine();
            String firstName = line.split(" ")[0];
            String lastName = line.split(" ")[1];
            double grade = Double.parseDouble(line.split(" ")[2]);

            Students student = new Students(firstName,lastName,grade);
            StudentList.add(student);
        }

        StudentList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students students : StudentList) {
            System.out.println(students);
        }
    }
}
