package functionalPrograming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class knightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String> printer = name -> System.out.println("Sir " + name);

        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        names.forEach(name -> printer.accept(name));

    }
}
