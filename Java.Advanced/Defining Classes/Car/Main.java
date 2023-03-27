package DefiningClasses.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split(" ");

            car.setBrand(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));

            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(),car.getModel(),car.getHorsePower());

        }
    }
}
