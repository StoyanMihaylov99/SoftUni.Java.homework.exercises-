package ObjectsAndClasses;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        while(!list.isEmpty()){
            Random random = new Random();
            int num = random.nextInt(list.size());
            String currentString = list.get(num);

            System.out.println(currentString);
            list.remove(currentString);
        }




    }
}
