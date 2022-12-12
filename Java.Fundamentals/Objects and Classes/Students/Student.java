package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    static class Students{
        String firstName;
        String lastName;
        String town;
        String age;

        public Students (String firstName, String lastName, String age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.town = town;
            this.age = age;


        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        List<Students> listStudent = new ArrayList<>();

        while(!input.equals("end")){
            String[] inputStudentArr = input.split(" ");
            String firstName  = inputStudentArr[0];
            String lastName  = inputStudentArr[1];
            String town = inputStudentArr[2];
            String age  = inputStudentArr[3];

            Students currentStudent = new Students(firstName,lastName,town,age);

            listStudent.add(currentStudent);





            input = scanner.nextLine();
        }

        String searchableTown = scanner.nextLine();

        for (Students current : listStudent){
            if(searchableTown.equals(current.getTown())){
                System.out.printf("%s %s is %s years old%n",current.getFirstName(),current.getLastName(),current.getAge());
            }
        }
    }
}
