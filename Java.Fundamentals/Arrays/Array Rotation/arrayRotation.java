package Arrays.ArrayExercise;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] Arr = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= countRotations ; rotation++) {

            String firsElement = Arr[0];
            for (int index = 0; index < Arr.length - 1; index++) {

                Arr[index] = Arr[index + 1];


            }
            Arr[Arr.length - 1] = firsElement;

        }
        for (String arr:Arr) {
            System.out.print(arr + " ");
        }


    }
}
