package DefiningClasses.Google;

public class Child {

    private String childName;
    private String childBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }
    public String toString() {
        return childName + " " + childBirthday;
    }
}
