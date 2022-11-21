package ObjectsAndClasses.groomingSalon;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity) {
            this.data.add(pet);
        }
    }

    public int getCount() {
        return this.data.size();
    }
    public boolean remove(String name) {
        int index = findpetIndex(name);

        if (index != -1) {
            data.remove(index);
            return true;
        }

        return false;
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    private int findpetIndex(String name) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getStatistics() {
        StringBuilder builder = new StringBuilder("The grooming salon has the following clients:"  + System.lineSeparator());

        for (Pet pet : data) {
            builder.append(pet.getName().toString());
            builder.append(" ");
            builder.append(pet.getOwner().toString());
            builder.append(System.lineSeparator());
        }

        return builder.toString().trim();
    }
}
