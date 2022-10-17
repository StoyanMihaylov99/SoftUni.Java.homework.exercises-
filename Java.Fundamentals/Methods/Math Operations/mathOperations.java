package Methods;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case"/":
                System.out.println(division(firstNum,secondNum));
                break;
            case"*":
                System.out.println(multiply(firstNum,secondNum));
                break;
            case"+":
                System.out.println(add(firstNum,secondNum));
                break;
            case"-":
                System.out.println(sub(firstNum,secondNum));
                break;


        }



    }
    public static int division (int a, int b){
        int sum = a / b;
        return sum;
    }
    public static int multiply (int a, int b){
        int sum = a * b;
        return sum;
    }
    public static int add (int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int sub ( int a, int b){
        int sum = a - b;
        return sum;
    }
}
