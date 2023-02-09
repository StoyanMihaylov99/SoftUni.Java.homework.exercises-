package setsAndMpsAdvanced;

import java.util.*;

public class productShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


           String inputInformation = scanner.nextLine();

        Map<String, Map<String,Double>> StoreMap = new TreeMap<>();


        while (!inputInformation.equals("Revision")){

            String[] currentInformation = inputInformation.split(", ");
            String store = currentInformation[0] ;
            String product = currentInformation[1];
            double price =Double.parseDouble(currentInformation[2]);

            StoreMap.putIfAbsent(store,new LinkedHashMap<>());
            Map<String,Double> products = StoreMap.get(store);
            products.put(product,price);

            inputInformation = scanner.nextLine();
        }


        for (Map.Entry<String, Map<String, Double>> entry : StoreMap.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> goods : entry.getValue().entrySet()) {
                String output = String.format("Product: %s, Price: %.1f", goods.getKey(), goods.getValue());
                System.out.println(output);
            }

        }

    }
}