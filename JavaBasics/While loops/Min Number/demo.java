import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int MIN = Integer.MAX_VALUE;

        while(!number.equals("Stop")){
            int number1 = Integer.parseInt(number);
            if(number1 < MIN){
                MIN = number1;
            }
            number = scanner.nextLine();

        }
        System.out.println(MIN);
    }
}
