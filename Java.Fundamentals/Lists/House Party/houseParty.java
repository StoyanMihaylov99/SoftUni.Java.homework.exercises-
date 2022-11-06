package Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> namesIn = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] command = input.split(" ");


            boolean isInTheList = false;
            boolean isNotInTheList = false;

            if (!"not".equalsIgnoreCase(command[2])) {

                for (String name : namesIn) {

                    if (name.equals(command[0])) {
                        isInTheList = true;
                        break;
                    }
                }

                if (isInTheList) {

                    System.out.printf("%s is already in the list!%n", command[0]);

                } else {

                    namesIn.add(command[0]);
                }
            } else{

                if (!namesIn.contains(command[0])) {

                    System.out.printf("%s is not in the list!%n", command[0]);

                } else {

                    namesIn.remove(command[0]);
                }
            }
        }


        for (String name : namesIn) {
            System.out.println(name);
        }

    }
}