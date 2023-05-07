package Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();


        while (!animal.equals("Beast!")){
            String[] parameters = scanner.nextLine().split(" ");

            String name = parameters[0];
            int age = Integer.parseInt(parameters[1]);
            String gender = parameters[2];


            try{
                switch (animal){
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;

                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }





            animal = scanner.nextLine();
        }



    }
}
