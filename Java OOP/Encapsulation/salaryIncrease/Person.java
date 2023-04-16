package Encapsulation.salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }


    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

        this.firstName = firstName;
    }

    private void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be negative integer");

        }
        this.age = age;
    }


    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        double actualBonus = bonus;
        if (age < 30) {
            actualBonus /= 2;
        }
       setSalary(salary * (1 + actualBonus / 100));
    }


    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva%n", firstName, lastName, salary);
    }
}
