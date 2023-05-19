package birhDayCelebations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        List<String> birthDates = new ArrayList<>();

        while (!command.equals("End")){
            String[] parts = command.split(" ");

            if(!parts[0].equals("Robot")){
                birthDates.add(parts[parts.length - 1]);
            }
            command = scanner.nextLine();
        }

        String date = scanner.nextLine();


        for (String dates: birthDates) {
            if(dates.endsWith(date)){
                System.out.println(dates);
            }
        }
    }
}
