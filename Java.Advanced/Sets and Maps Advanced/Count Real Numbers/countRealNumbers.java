package setsAndMpsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> map = new LinkedHashMap<>();

        for (double value: input) {
            if(!map.containsKey(value)){
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        map.keySet().forEach(key -> System.out.printf("%.1f -> %d%n",key,map.get(key)));


    }
}
