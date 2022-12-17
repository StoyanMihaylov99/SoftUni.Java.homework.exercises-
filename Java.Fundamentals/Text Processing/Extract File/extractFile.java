package textProcessing.Exercise;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        String fileName = input[input.length - 1];

        String name = fileName.split("\\.")[0];
        String type = fileName.split("\\.")[1];

        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s%n",type);

    }
}
