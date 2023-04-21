package Teams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Teams.Person> firstTeam;
    private List<Teams.Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setFirstTeam(List<Teams.Person> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public void setReserveTeam() {
        setReserveTeam();
    }

    public void setReserveTeam(List<Teams.Person> reserveTeam) {
        this.reserveTeam = reserveTeam;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Teams.Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Teams.Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }

    public void addPlayer(Teams.Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }
}
