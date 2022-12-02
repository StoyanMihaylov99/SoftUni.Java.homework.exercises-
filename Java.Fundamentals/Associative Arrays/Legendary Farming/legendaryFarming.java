package AssociativeArrays.Exercises;

import java.util.Scanner;
import java.util.*;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        Map<String, Integer> junkItems = new LinkedHashMap<>();
        while (true) {
            items.put("shards", 0);
            items.put("fragments", 0);
            items.put("motes", 0);

            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int Quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + Quantity);

                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, Quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + Quantity);
                    }
                }

            }
            if (items.get("shards") >= 250) {
                System.out.println("Shadowmourne is obtained!");
            } else if (items.get("fragments") >= 250) {
                System.out.println("Valanyr is obtained!");
            } else if (items.get("motes") >= 250) {
                System.out.printf("Dragonwratch is obtained!");
            }


            items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

            junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }
    }
}
