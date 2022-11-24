package AssociativeArrays;

import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();



        for (int i = 1; i <= n; i++) {

            String currentKey = scanner.nextLine();
            String currentValue = scanner.nextLine();

            if(!map.containsKey(currentKey)){
                map.put(currentKey,new ArrayList<>());
            }
                map.get(currentKey).add(currentValue);




        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }

    }
}
