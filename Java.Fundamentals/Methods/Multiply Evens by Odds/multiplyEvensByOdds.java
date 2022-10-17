package Methods;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.abs(evenSum(input) * oddSum(input)));



    }

    public static int evenSum (int n){
        int sum = 0;
       while(n != 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                sum+=digit;

            }
            n = n / 10;
        }
        return sum;
    }
    public static int oddSum(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit % 2 != 0 ){
                sum+=digit;
            }
            n = n / 10;
        }
        return sum;
    }
}
