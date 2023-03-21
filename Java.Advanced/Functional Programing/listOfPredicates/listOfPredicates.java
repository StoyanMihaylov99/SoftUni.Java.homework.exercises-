package functionalPrograming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class listOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Predicate<Integer> predicate = number -> {
            for (Integer divider : numbers) {
                if (number % divider != 0) {
                    return false;
                }
            }
            return true;
        };


        IntStream.rangeClosed(1, n).forEach(e -> {
            if (predicate.test(e)) {
                System.out.print(e + " ");
            }
        });
    }
}
