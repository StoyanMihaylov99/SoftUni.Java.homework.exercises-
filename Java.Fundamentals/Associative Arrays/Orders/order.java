package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while(!input.equals("buy")){
            String currentProduct = input.split(" ")[0];
            double currentPrice = Double.parseDouble(input.split(" ")[1]);
            int currentQuantity = Integer.parseInt(input.split(" ")[2]);


            productPrice.put(currentProduct,currentPrice);

            if(!productQuantity.containsKey(currentProduct)){
                productQuantity.put(currentProduct,currentQuantity);
            } else {
                productQuantity.put(currentProduct,productQuantity.get(currentProduct) + currentQuantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String product = entry.getKey();
            double finalSum = entry.getValue() * productQuantity.get(product);
            System.out.printf("%s -> %.2f%n", entry.getKey(),finalSum);
        }

    }
}
