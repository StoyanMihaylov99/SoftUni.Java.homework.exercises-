package ForLoopsExersice;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monblan = 0;
        double Kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double total = 0;

        for (int i = 1; i <= groups; i++) {
            int countMembers = Integer.parseInt(scanner.nextLine());

            if (countMembers <= 5) {
                musala += countMembers;
            } else if (countMembers <= 12) {
                monblan += countMembers;
            } else if (countMembers <= 25) {
                Kilimandjaro += countMembers;
            } else if (countMembers <= 40) {
                k2 += countMembers;
            } else {
                everest += countMembers;}

            total += countMembers;

            }
        System.out.printf("%.2f%%%n", musala / total * 100);
        System.out.printf("%.2f%%%n", monblan / total * 100);
        System.out.printf("%.2f%%%n", Kilimandjaro/ total * 100);
        System.out.printf("%.2f%%%n", k2 / total * 100);
        System.out.printf("%.2f%%%n", everest / total * 100);
        }

    }
