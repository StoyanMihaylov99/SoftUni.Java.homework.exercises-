package Methods.MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        System.out.println(vowelsCountCount(text));






        //A, E, I, O, U, Y
    }

    private static int vowelsCountCount(String text){
        int count =  0;

        for (char symbol: text.toCharArray()) {
            if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y'){
                count++;
            }
        }
        return count;



    }
}
