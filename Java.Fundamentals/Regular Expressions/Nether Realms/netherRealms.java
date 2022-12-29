package regex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class netherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int totalHealth = 0;
        int baseDamage = 0;

        String regex = "(?<damage>-?[0.0-9])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            double currentDamage = Integer.parseInt(matcher.group("damage"));

            baseDamage+= currentDamage;
        }



        for (int i = 0; i <input.length() ; i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetter(currentChar)){
                int charNum = currentChar;
                totalHealth+= charNum;
            } else if (Character.isDigit(currentChar)){
                int damage = currentChar;
                baseDamage += damage;
            }
        }
        System.out.println();



    }

}
