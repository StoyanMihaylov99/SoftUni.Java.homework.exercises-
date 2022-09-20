package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
            if (secondNumber > thirdNumber) {
                System.out.println(secondNumber);
                System.out.println(thirdNumber);
            }
            if (secondNumber < thirdNumber) {
                System.out.println(thirdNumber);
                System.out.println(secondNumber);
            }
            if(secondNumber == thirdNumber){
                System.out.println(secondNumber);
                System.out.println(thirdNumber);
            }
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
            if (firstNumber > thirdNumber) {
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
            }
            if (firstNumber < thirdNumber) {
                System.out.println(thirdNumber);
                System.out.println(firstNumber);
            }
            if(firstNumber == thirdNumber){
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
            }

        }
        if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println(thirdNumber);
            if (secondNumber > firstNumber) {
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }
            if (secondNumber < firstNumber) {
                System.out.println(firstNumber);
                System.out.println(secondNumber);
            }
            if(secondNumber == firstNumber){
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }
        }
    }
}

