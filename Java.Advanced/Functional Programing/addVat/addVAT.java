package functionalPrograming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class addVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Prices with VAT:");
        Function<String,Double> parse = x -> Double.parseDouble(x);
        Consumer<Double> print = element -> System.out.printf("%.2f%n",element);
        UnaryOperator<Double> addVAT = price -> price * 1.20;

        Arrays.stream(scanner.nextLine().split(", ")).map(x -> parse.apply(x)).map(element -> addVAT.apply(element))
                .forEach(element -> print.accept(element));



    }
}
