package AssociativeArrays;

import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for(int num : numbersArr){
            countMap.putIfAbsent(num,0);
            countMap.put(num, countMap.get(num) + 1);

        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : countMap.entrySet()) {
            System.out.printf("%d -> %d%n", integerIntegerEntry.getKey(), integerIntegerEntry.getValue());
        }

    }
}
