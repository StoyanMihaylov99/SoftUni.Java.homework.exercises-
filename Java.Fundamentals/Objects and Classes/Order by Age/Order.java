package ObjectsAndClasses.orderByAge;

public class Order {
    String name;
    int ID;
    int age;

    public Order(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public String toString(){
       return String.format("%s with ID: %d is %d years old.",this.name,this.ID,this.age);
    }
}
