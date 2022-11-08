package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("End")) {
            switch (commands[0]) {
                case "Add":
                    int number = Integer.parseInt(commands[1]);
                    items.add(number);
                    break;
                case "Insert":
                    int InsertNumber = Integer.parseInt(commands[1]);
                    int InsertIndex = Integer.parseInt(commands[2]);
                    if (isValidIndex(InsertIndex, items.size())) {
                        items.add(InsertIndex, InsertNumber);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int RemoveIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(RemoveIndex, items.size())) {

                        items.remove(RemoveIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (commands[1].equals("left")) {
                        int counts = Integer.parseInt(commands[2]);
                        for (int i = 1; i <= counts; i++) {
                            int firstNumber = items.get(0);
                            items.add(firstNumber);
                            items.remove(0);
                        }

                    } else if(commands[1].equals("right")){
                        int counts = Integer.parseInt(commands[2]);
                        for (int i = 1; i <=counts ; i++) {
                           int lastNumber = items.get(items.size() - 1);
                           items.add(0, lastNumber);
                           items.remove(items.size() - 1);

                        }
                    }
                    break;

            }


            commands = scanner.nextLine().split(" ");
        }

        for (int number:items) {
            System.out.print(number + " ");
        }


    }

    private static boolean isValidIndex(int index, int sizeOfList) {
        return index >= 0 && index <= sizeOfList - 1;
    }
}
