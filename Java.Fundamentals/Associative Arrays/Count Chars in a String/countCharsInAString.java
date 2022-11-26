package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputLine = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character,Integer> countMap = new LinkedHashMap<>();


        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);

            Integer count = countMap.get(currentChar);


            if(countMap.containsKey(currentChar)){
                countMap.put(currentChar, count + 1);
            } else {
                countMap.put(currentChar,1);
            }
        }


        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }


    }
}
