package ForLoopsExersice;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            double namePoints = judgeName.length() ;

            pointsAcademy = pointsAcademy + ((namePoints * judgePoints) / 2);

            if (pointsAcademy > 1250.5) {
                System.out.printf("%nCongratulations, %s got a nominee for leading role with %.1f!", name, pointsAcademy);
                break;
            }
        }
        if(pointsAcademy < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - pointsAcademy);
        }


    }

}
