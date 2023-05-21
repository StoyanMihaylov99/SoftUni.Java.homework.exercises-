package foodShortage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyers = new LinkedHashMap<>();

        int count = Integer.parseInt(scanner.nextLine());
        while (count-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Buyer buyer;

            if (data.length == 4) {
                String id = data[2];
                String birthDate = data[3];
                buyer = new Citizen(name, age, id, birthDate);
            } else {
                String group = data[2];
                buyer = new Rebel(name, age, group);
            }

            buyers.put(name, buyer);
        }

        String input;
        while (!(input = scanner.nextLine()).equals("End")) {
            final String name = input;
            buyers.entrySet().stream()
                    .filter(e -> e.getKey().equals(name))
                    .forEach(e -> e.getValue().buyFood());
        }

        System.out.println(buyers.values().stream()
                .mapToInt(Buyer::getFood).sum());
    }
}
