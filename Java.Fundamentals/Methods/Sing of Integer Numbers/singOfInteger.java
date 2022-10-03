package Methods;

import java.util.Scanner;

public class singOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        number(input);
    }





    public static void number(int number){
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
