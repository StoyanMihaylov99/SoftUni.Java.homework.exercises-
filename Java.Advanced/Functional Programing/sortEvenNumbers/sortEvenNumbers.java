package functionalPrograming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        numbers.removeIf(number -> number % 2 != 0);

        printing(numbers);
        System.out.println();
        numbers.sort((a,b) -> a.compareTo(b));
        printing(numbers);



    }












    private static void printing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() ; i++) {
            if(i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + ", ");
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }
}
