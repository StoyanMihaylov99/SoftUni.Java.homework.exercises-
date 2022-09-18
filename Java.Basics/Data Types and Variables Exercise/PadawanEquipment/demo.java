import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyHave = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double sumLight = Math.ceil(countOfStudents + 0.10 * countOfStudents) * priceSaber;
        double sumRobes = countOfStudents * priceRobes;
        double sumBelts = (countOfStudents - countOfStudents / 6) * priceBelts;

        double totalSum = sumBelts + sumLight + sumRobes;

        if(totalSum <= moneyHave){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - moneyHave);
        }
    }
}

