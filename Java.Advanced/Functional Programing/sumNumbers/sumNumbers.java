package functionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String,Integer> parse = x -> Integer.parseInt(x);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(element -> parse.apply(element)).collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(a -> a).sum();


        System.out.print("Count = " + numbers.size());
        System.out.println();
        System.out.print("Sum = " + sum);



    }
}
