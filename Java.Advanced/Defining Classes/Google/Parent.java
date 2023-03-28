package DefiningClasses.Google;

public class Parent {

    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }
    public String toString() {
        return parentName + " " + parentBirthday;
    }
}
