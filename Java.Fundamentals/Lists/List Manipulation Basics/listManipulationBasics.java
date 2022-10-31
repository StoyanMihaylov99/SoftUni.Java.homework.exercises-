package Lists;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List <Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("end")) {
            int item = 0;
            int index = 0;
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (commands.get(0)){
                case "Add":
                    item = Integer.parseInt(commands.get(1));
                    items.add(item);
                    break;
                case "Remove":
                    item = Integer.parseInt(commands.get(1));
                    items.remove(Integer.valueOf(item));

                    break;
                case "RemoveAt":
                    index = Integer.parseInt(commands.get(1));
                    items.remove(index);
                    break;
                case "Insert":
                    item = Integer.parseInt(commands.get(1));
                    index = Integer.parseInt(commands.get(2));
                    items.add(index,item);

                    break;
            }



            input = scanner.nextLine();
        }
        System.out.println(items.toString().replaceAll("[\\[\\],]", ""));
        }



    }

