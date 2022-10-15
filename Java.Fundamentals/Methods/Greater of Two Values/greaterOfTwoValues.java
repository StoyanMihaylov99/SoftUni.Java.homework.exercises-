package Methods;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a,b));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println(getMax(first,second));
                break;

        }
    }
    public static int getMax(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static char getMax(char a, char b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static String getMax (String a, String b){
        String result = "";
        if(a.compareTo(b) > 0){
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
