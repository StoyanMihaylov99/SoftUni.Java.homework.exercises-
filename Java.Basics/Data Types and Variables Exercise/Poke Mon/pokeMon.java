package dataTypesExercise;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        double originalPower = pokePower;
        int pokes = 0;
        while (pokePower >= distance) {
            pokePower -= distance;
            pokes++;
            if (pokePower == originalPower * 0.5) {
                if (exhaustionFactor > 0) {
                    pokePower = pokePower / exhaustionFactor;

                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokes);
    }
}
