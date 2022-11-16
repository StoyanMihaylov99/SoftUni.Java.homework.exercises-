package ObjectsAndClasses.students;

public class Students {
    String firstName;
    String lastName;
    double grade;

    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGrade() {
        return grade;
    }


    public String toString() {
        //"{first name} {second name}: {grade}"
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }

}


