package Methods;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        grades(input);



    }

    public static void grades(double grades){
        if(grades <= 2.99){
            System.out.println("Fail");
        } else if(grades <= 3.49){
            System.out.println("Poor");
        } else if(grades <= 4.49){
            System.out.println("Good");
        } else if(grades <= 5.49){
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
