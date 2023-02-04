package setsAndMpsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class softUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        TreeSet<String> guestList = new TreeSet<>();


        while (!input.equals("PARTY")){

            guestList.add(input);
            input = scanner.nextLine();
        }

        String guestThatCome = scanner.nextLine();

        while (!guestThatCome.equals("END")){
            guestList.remove(guestThatCome);
            guestThatCome = scanner.nextLine();
        }

        System.out.println(guestList.size());
        for (String didntCome: guestList) {
            System.out.println(didntCome);
        }
    }
}
