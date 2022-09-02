package Arrays.ArrayExercise;

import java.util.Scanner;
import java.util.Arrays;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] arrCommand = command.split(" ");
            switch (arrCommand[0]) {
                case "swap":
                    int index1 = Integer.parseInt(arrCommand[1]); // index from partCommand
                    int element1 = input[index1];
                    int index2 = Integer.parseInt(arrCommand[2]);// index from partCommand
                    int element2 = input[index2];

                    // swap
                    input[index1] = element2;
                    input[index2] = element1;

                    break;
                case "multiply":
                    //•	"multiply {index1} {index2}"
                    int multiplyIndex1 = Integer.parseInt(arrCommand[1]); // index from partCommand
                    int digit1 = input[multiplyIndex1];
                    int multiplyIndex2 = Integer.parseInt(arrCommand[2]);// index from partCommand
                    int digit2 = input[multiplyIndex2];
                    int sum = digit1 * digit2;
                    input[multiplyIndex1] = sum;

                    break;
                case "decrease":
                    for (int index = 0; index <= input.length - 1; index++) {
                        input[index] -= 1;
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        for (int index = 0; index <= input.length - 1; index++) {
            if (index != input.length - 1) {
                System.out.print(input[index] + ", ");
            } else {
                System.out.print(input[index]);
            }
        }
    }
}

