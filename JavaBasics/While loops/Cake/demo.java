
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int cakeSize = length * width;
        while (cakeSize > 0){
            String input = scanner.nextLine();
            if(input.equals("STOP")){
                break;
            }
            int cake = Integer.parseInt(input);
            cakeSize -= cake;
        }
        if (cakeSize < 0){
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));

        } else {
            System.out.printf("%d pieces are left.", cakeSize);
        }
    }
}
