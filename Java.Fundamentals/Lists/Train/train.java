package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;


public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int limit = Integer.parseInt(scanner.nextLine());
        String [] command  = scanner.nextLine().split(" ");

        while(!command[0].equals("end")){
            if(command[0].equals("Add")){
                int addWagon = Integer.parseInt(command[1]);
                wagons.add(addWagon);
            } else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= limit) {
                        int newWagon = wagons.get(i) + passengers;
                        wagons.set(i, newWagon);
                        break;
                    }
                }
            }


            command = scanner.nextLine().split(" ");
        }

        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));







    }
}
