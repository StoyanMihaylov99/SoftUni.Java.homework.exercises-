package DefiningClasses.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Person> peopleData = new HashMap<>();

        while (!input.equals("End")){
            String[] parameters = input.split(" ");
            String personName = parameters[0];
            peopleData.putIfAbsent(personName,new Person());

            String typeCommand = parameters[1];

            switch (typeCommand){
                case "company":
                    String companyName = parameters[2];
                    String department = parameters[3];
                    double salary = Double.parseDouble(parameters[4]);
                    Company company = new Company(companyName,department,salary);
                    peopleData.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = parameters[2];
                    String pokemonType = parameters[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    peopleData.get(personName).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parent = parameters[2];
                    String parentBirthday = parameters[3];
                    Parent parent1 = new Parent(parent,parentBirthday);
                    peopleData.get(personName).getParents().add(parent1);
                    break;
                case "children":
                    String childName = parameters[2];
                    String childBirthday = parameters[3];
                    Child child = new Child(childName,childBirthday);
                    peopleData.get(personName).getChildren().add(child);
                    break;
                case "car":
                    String carModel = parameters[2];
                    int carSpeed = Integer.parseInt(parameters[3]);
                    Car car = new Car(carModel, carSpeed);
                    peopleData.get(personName).setCar(car);
                    break;

            }

            input = scanner.nextLine();


        }
        String searchedPerson = scanner.nextLine();
        System.out.println(searchedPerson);

        Person personalData = peopleData.get(searchedPerson);
        System.out.println(personalData);
    }
}
