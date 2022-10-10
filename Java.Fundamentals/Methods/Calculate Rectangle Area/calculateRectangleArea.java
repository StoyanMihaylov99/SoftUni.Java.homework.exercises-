package Methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(rectangleArea(a, b));

    }

    public static int rectangleArea(int a, int b) {
        return a * b;


    }
}

