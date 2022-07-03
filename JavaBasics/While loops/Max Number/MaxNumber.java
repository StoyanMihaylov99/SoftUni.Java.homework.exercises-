import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int MAX = Integer.MIN_VALUE;

        while(!number.equals("Stop")){
            int number1 = Integer.parseInt(number);
            if(number1 > MAX){
                MAX = number1;
            }
            number = scanner.nextLine();

        }
        System.out.println(MAX);
    }
}
