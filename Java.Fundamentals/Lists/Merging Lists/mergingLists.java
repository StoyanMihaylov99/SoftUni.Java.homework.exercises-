package Lists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List <Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


      List<Integer> resultList = new ArrayList<>();
      int minListSize = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i <minListSize ; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);

        }


        if(firstList.size() > secondList.size()){
            resultList.addAll(firstList.subList(minListSize,firstList.size()));

        } else {
            resultList.addAll(secondList.subList(minListSize,secondList.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
        
    }
}
