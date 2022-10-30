package Lists;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Double> items = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());;

        for (int i = 0; i < items.size() - 1; i++) {
            if(items.get(i).equals(items.get(i + 1))){
                double firstElement = items.get(i);
                double secondElement = items.get(i + 1);
                items.set(i,firstElement + secondElement);
                items.remove( i + 1);
                i = -1;
            }
        }
        System.out.println(joinElements(items, " "));


    }
    private static String joinElements(List<Double> list, String delimiter){
        String result = "";
        for(Double num : list){
            DecimalFormat df = new DecimalFormat("0.#");
            String format = df.format(num);
            result += format + " ";
        }
        return result;
    }
}
