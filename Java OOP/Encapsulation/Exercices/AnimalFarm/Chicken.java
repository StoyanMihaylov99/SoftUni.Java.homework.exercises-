package Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;

    }


    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
       return calculateProductPerDay();
    }


    private double calculateProductPerDay() {
        double produce = 0;
        if (age <= 5) {
            produce = 2;
        } else if (age < 11) {
            produce = 1;
        } else {
            produce = 0.75;
        }
        return produce;
    }

    @Override
    public String toString() {
        return String.format("Encapsulation.AnimalFarm.Chicken %s (age %d) can produce %.2f eggs per day.", name,age,productPerDay());
    }
}
