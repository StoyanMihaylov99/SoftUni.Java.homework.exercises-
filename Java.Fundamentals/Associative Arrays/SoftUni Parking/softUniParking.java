package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> park = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String user = command[1];
            String license = command[command.length - 1];

            if (command[0].equals("register")) {
                if (park.containsKey(user)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", park.get(user));
                } else {
                    park.put(user, license);
                    System.out.printf("%s registered %s successfully%n", user, license);
                }

            } else {
                if (park.containsKey(user)) {
                    System.out.printf("%s unregistered successfully%n", user);
                    park.remove(user);
                } else {
                    System.out.printf("ERROR: user %s not found%n", user);
                }

            }
        }


        for (Map.Entry<String, String> entry : park.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());

        }
    }
}
