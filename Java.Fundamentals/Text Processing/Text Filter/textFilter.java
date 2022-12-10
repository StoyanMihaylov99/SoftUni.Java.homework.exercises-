package textProcessing.textFilter;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] BanWordsArr = scanner.nextLine().split(", ");

        String text = scanner.nextLine();


        for (String badWord : BanWordsArr) {
            text = text.replace(badWord, replaceString("*",badWord.length()));

        }
        System.out.println(text);
    }


    private static String replaceString(String text, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {

            result += "*";
        }
        return result;
    }

}
