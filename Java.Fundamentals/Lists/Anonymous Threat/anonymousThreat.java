package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > list.size() - 1) {
                    endIndex = list.size() - 1;
                }

                boolean isValidIndex = startIndex <= list.size() - 1 && endIndex >= 0 && startIndex < endIndex;


                if (isValidIndex) {
                    String result = "";
                    for (int index = startIndex; index < endIndex; index++) {
                        result += list.get(index);
                    }
                    for (int index = startIndex; index <endIndex ; index++) {
                        list.remove(startIndex);}

                    list.add(startIndex, result);
                }

            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementForDivide = list.get(index);
                list.remove(index);
                int beginIndexOfText = 0;
                int partSize = elementForDivide.length() / parts;
                for (int part = 1; part < parts; part++) {
                    list.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    index++;
                    beginIndexOfText += partSize;
                }
                list.add(index, elementForDivide.substring(beginIndexOfText));
            }

        command = scanner.nextLine();

    }
        System.out.println(String.join(" ", list));
 }
}
