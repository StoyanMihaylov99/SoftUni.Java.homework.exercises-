package Methods.MethodsExercise;

import java.util.Scanner;

public class NxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        NxN(input);


    }

    public static void NxN(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
