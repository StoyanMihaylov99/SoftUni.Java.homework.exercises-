package functionalPrograming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate<String> length = name -> name.length() <= n;

        names.stream().filter(e -> length.test(e)).forEach(e -> System.out.println(e));


    }
}
