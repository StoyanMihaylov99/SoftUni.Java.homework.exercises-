package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String,Integer> listOfResources = new LinkedHashMap<>();



        while(!input.equals("stop")){
            int currentQuantity = Integer.parseInt(scanner.nextLine());

            if(!listOfResources.containsKey(input)){
                listOfResources.put(input,currentQuantity);
            } else {
                listOfResources.put(input,listOfResources.get(input) + currentQuantity );
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : listOfResources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
