package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "Delete":
                    int number = Integer.parseInt(command[1]);
                    for (int i = 0; i <items.size(); i++) {
                        if(number == items.get(i)){
                            items.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    int insertNumber = Integer.parseInt(command[1]);
                    int insertPosition = Integer.parseInt(command[2]);
                    items.add(insertPosition, insertNumber);

                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println(items.toString().replaceAll("[\\[\\],]", ""));


    }
}
