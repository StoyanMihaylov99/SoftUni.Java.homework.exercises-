package conditionalStatementsMoreExersise;

import java.util.Scanner;

public class pipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double totalP1 = P1 * H;
        double totalP2 = P2 * H;
        double total = totalP1 + totalP2;
        double percentageOfVolume = (total * 100) / volume;
        double percentageOfP1 = (totalP1 * 100) / total;
        double percentageOfP2 = (totalP2 * 100) / total;




        if (volume >= total) {
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f %%. Pipe 2: %.2f %%", percentageOfVolume, percentageOfP1 ,percentageOfP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, total - volume);
        }

    }
}
