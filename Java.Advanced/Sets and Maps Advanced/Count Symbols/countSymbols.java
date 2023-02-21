package setsAndMpsAdvanced.exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < inputLine.length(); i++) {
            if (!map.containsKey(inputLine.charAt(i))) {
                map.put(inputLine.charAt(i), 1);
            } else {
                map.put(inputLine.charAt(i), map.get(inputLine.charAt(i)) + 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }

    }


}

