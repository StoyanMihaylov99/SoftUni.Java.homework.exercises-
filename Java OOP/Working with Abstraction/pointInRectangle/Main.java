package WorkingWithAbstraction.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Point bottomLeft = new Point(input[0], input[1]);
        Point topLeft = new Point(input[2], input[3]);

        Rectangle rectangle = new Rectangle(bottomLeft,topLeft);

        int pointsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <pointsCount ; i++) {
            Point current = PointUtil.parsePoint(scanner.nextLine());

            System.out.println(rectangle.Contains(current));

        }
    }
}
