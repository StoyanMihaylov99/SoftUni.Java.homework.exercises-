package DefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;
    private List<Child> children;
    private List<Parent> parents;
    private List<Pokemon> pokemons;


    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Person(Company company, Car car, List<Child> children, List<Parent> parents, List<Pokemon> pokemons) {
        this.company = company;
        this.car = car;
        this.children = children;
        this.parents = parents;
        this.pokemons = pokemons;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Company:").append("\n");
        if (company != null) {
            builder.append(company).append("\n");
        }
        builder.append("Car:").append("\n");
        if (car != null) {
            builder.append(car).append("\n");
        }

        builder.append("Pokemon:").append("\n");
        for (Pokemon pokemon : pokemons) {
            builder.append(pokemon).append("\n");
        }

        builder.append("Parents:").append("\n");
        for (Parent parent : parents) {
            builder.append(parent).append("\n");
        }

        builder.append("Children:").append("\n");
        for (Child child : children) {
            builder.append(child).append("\n");
        }

        return builder.toString();
    }
}
