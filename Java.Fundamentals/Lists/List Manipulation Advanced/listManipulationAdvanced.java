package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            int item = 0;
            List<String> commands = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            switch (commands.get(0)) {
                case "Contains":
                    item = Integer.parseInt(commands.get(1));
                    if (list.contains(item)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commands.get(1).equals("even")) {
                        for (int i = 0; i <= list.size() - 1; i++) {
                            int num = list.get(i);
                            if (num % 2 == 0) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (commands.get(1).equals("odd")) {
                        for (int i = 0; i <= list.size() - 1; i++) {
                            int num = list.get(i);
                            if (num % 2 != 0) {
                                System.out.print(list.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }

                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i <= list.size() - 1; i++) {
                        int currentSum = list.get(i);
                        sum += currentSum;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int num = Integer.parseInt(commands.get(2));
                    String outputFilter = "";
                    if (commands.get(1).equals("<")) {
                        for (int aList : list) {
                            if (aList < num) {
                                System.out.print(aList+ " ");
                            }
                        }
                    System.out.println();
                    }
                    if (commands.get(1).equals("<=")) {
                        for (int aList : list) {
                            if (aList<= num) {
                                System.out.print(aList+ " ");
                            }
                        }
                    System.out.println();
                    }
                    if (commands.get(1).equals(">")) {
                        for (int aList : list) {
                            if (aList > num) {
                                System.out.print(aList+ " ");
                            }
                        }
                        System.out.println();
                    }
                    if (commands.get(1).equals(">=")) {
                        for (int aList : list) {
                            if (aList >= num) {
                                System.out.print(aList+ " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}

