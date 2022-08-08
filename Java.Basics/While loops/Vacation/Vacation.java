import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spendDaysCount = 0;
        int daysCount = 0;


        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyHave = Double.parseDouble(scanner.nextLine());
        while (moneyHave < moneyNeeded && spendDaysCount < 5) {
            String spendOrSave = scanner.nextLine();
            daysCount++;

            double moneyAction = Double.parseDouble(scanner.nextLine());

            if (spendOrSave.equals("spend")) {
                spendDaysCount++;
                moneyHave -= moneyAction;
            }
            if (moneyHave <= 0) {
                moneyHave = 0;
            }

            if (spendOrSave.equals("save")) {
                spendDaysCount = 0;
                moneyHave += moneyAction;
            }
        }
        if (moneyHave >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
        if (spendDaysCount == 5) {
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d", daysCount);
        }


    }
}
