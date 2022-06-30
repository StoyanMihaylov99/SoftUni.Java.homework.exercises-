package WhileLoops;

import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (num > sum){
            int n = Integer.parseInt(scanner.nextLine());
            sum+= n;
        }
        System.out.println(sum);
    }
}