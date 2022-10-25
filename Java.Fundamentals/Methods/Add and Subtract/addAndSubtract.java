package Methods.MethodsExercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInteger = Integer.parseInt(scanner.nextLine());
        int secondInteger = Integer.parseInt(scanner.nextLine());
        int thirdInteger = Integer.parseInt(scanner.nextLine());
        int sum = Sum(firstInteger, secondInteger);
        int sub = sum - thirdInteger;
        System.out.println(sub);



    }

    public static int Sum (int a, int b){
        return a + b;
    }
    public static int Sub (int a, int b){
        int sub = a - b;
        return sub;
    }
}
