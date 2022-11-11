package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class sumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        BigInteger result = firstNumber.add(secondNumber);
        System.out.println(result);
    }
}
