package Arrays.ArrayExercise;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] people = new int[n];
        for (int i = 0; i < people.length; i++) {

            people[i] = Integer.parseInt(scanner.nextLine());
        }


        int sum = 0;

        for (int i = 0; i <= people.length - 1 ; i++) {
            System.out.print(people[i] + " ");
            int currentNum = people[i];
            sum += currentNum;

        }

        System.out.println();
        System.out.println(sum);

    }
}