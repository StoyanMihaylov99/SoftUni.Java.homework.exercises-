package Encapsulation.sortByNameAndAge;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        this.salary = salary;
    }

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void increaseSalary(double bonus) {
        double actualBonus = bonus;
        if (age < 30) {
            actualBonus /= 2;
        }
        double newSalary = salary * (1 + actualBonus / 100);
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old.";
    }
}


