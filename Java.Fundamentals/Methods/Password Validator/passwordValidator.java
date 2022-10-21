package Methods.MethodsExercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(!characters(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!lettersAndDigits(input)){
            System.out.println("Password must consist only of letters and digits");
        }

        if(!atLeast(input)){
            System.out.println("Password must have at least 2 digits");
        }

        if(characters(input) && lettersAndDigits(input) && atLeast(input)) {
            System.out.println("Password is valid");
        }




    }

    public static boolean characters (String text){
        boolean isItTrue = false;
        if(text.length() >= 6 && text.length() <=10 - 1 ) {
            isItTrue = true;
        }
        return isItTrue;
    }



    public static boolean lettersAndDigits(String text){
        for (char symbol: text.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean atLeast (String text){
       int countDigits = 0;

        for (char symbol: text.toCharArray()) {
            if(Character.isDigit(symbol)){
                countDigits++;
            }
            
        }
        if(countDigits >= 2){
            return true;
        } else {

            return false;
        }
    }
}
