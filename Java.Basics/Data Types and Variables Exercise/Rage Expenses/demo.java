import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = lostGameCount / 2;
        int mouseCounter = lostGameCount / 3;
        int keyboardCount = lostGameCount / 6;
        int displayCount = lostGameCount / 12;

        double finalPrice = (headsetCount * headsetPrice) + (mouseCounter * mousePrice) +
                (keyboardCount * keyboardPrice) +(displayCount * displayPrice);



        System.out.printf("Rage expenses: %.2f lv.", finalPrice);


    }
}

