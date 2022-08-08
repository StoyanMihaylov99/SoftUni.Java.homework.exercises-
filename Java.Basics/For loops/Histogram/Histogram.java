package ForLoopsExersice;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for(int i = 1; i <= n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200){
                p1++;
            } else if (currentNumber < 400){
                p2++;
            } else if (currentNumber < 600){
                p3++;
            } else if (currentNumber < 800){
                p4++;
            } else {
                p5++;
            }

        }
        System.out.printf("%.2f%%%n", p1 / n * 100);
        System.out.printf("%.2f%%%n", p2 / n * 100);
        System.out.printf("%.2f%%%n", p3 / n * 100);
        System.out.printf("%.2f%%%n", p4 / n * 100);
        System.out.printf("%.2f%%%n", p5 / n * 100);
    }
}
