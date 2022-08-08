import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String FavBook = scanner.nextLine();
        String input = scanner.nextLine();
        int counter = 0;

        while(!input.equals("No More Books")){
            if(input.equals(FavBook)){
                System.out.printf("You checked %d books and found it.%n", counter);
                break;
            }
            counter++;


            input = scanner.nextLine();
        }
        if(input.equals("No More Books")){
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", counter);}


    }
}
