package functionalPrograming.exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class customMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> ListOfNum= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Consumer<List<Integer>> min = list -> System.out.println(Collections.min(list));

        min.accept(ListOfNum);

    }
}
