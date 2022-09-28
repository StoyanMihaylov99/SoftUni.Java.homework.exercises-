package dataTypesExercise;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double bestSnow = 0;
        double bestTime = 0;
        double bestValue = Double.MIN_VALUE;
        double bestQuality = 0;

        for (int i = 1; i <= n; i++) {
            double snow = Double.parseDouble(scanner.nextLine());
            double time = Double.parseDouble(scanner.nextLine());
            double quality = Double.parseDouble(scanner.nextLine());
            double snowballValue = snow / time;
            double finalValue = Math.pow(snowballValue, quality);
            if (finalValue > bestValue) {
                bestSnow = snow;
                bestTime = time;
                bestValue = finalValue;
                bestQuality = quality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
