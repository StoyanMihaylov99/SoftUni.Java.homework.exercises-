package functionalPrograming.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class appliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));


        while (!command.equals("end")){
            if(!command.equals("print")){
                UnaryOperator<Integer>  operation = getResult(command);

                input = input.stream().map(operation::apply).collect(Collectors.toList());
            } else {
                print.accept(input);
                System.out.println();
            }

            command = scanner.nextLine();
        }



    }

    private static UnaryOperator<Integer> getResult(String command){
        switch (command){
            case "add":
                return e -> e + 1;
            case "multiply":
                return e -> e * 2;
            case "subtract":
                return e -> e - 1;
            default:
                throw new IllegalArgumentException("Unknown condition " + command);
        }
    }
}
