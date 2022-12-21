package textProcessing.Exercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        StringBuilder output = new StringBuilder(inputString);

        int power = 0;

        for (int i = 0; i < output.length() ; i++) {
            if(output.charAt(i) == '>' && Character.isDigit(output.charAt(i + 1))){
                power += Integer.parseInt(output.charAt(i + 1) + "");
            }

            if(power > 0){
                if(!(output.charAt(i) == '>')) {
                    output.deleteCharAt(i);
                    power--;
                    i--;
                }
            }
        }

        System.out.println(output);
    }
}
