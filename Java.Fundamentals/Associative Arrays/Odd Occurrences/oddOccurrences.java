package AssociativeArrays;

import java.sql.Array;
import java.util.*;

public class oddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();


        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if (counts.containsKey(lowerWord)) {
                counts.put(lowerWord, counts.get(lowerWord) + 1);
            } else {
                counts.put(lowerWord, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 0) {

            } else {
                list.add(entry.getKey());
            }
        }


        System.out.println(String.join(", ",list));
    }


}


