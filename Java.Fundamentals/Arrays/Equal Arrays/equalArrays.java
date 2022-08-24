package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] SecondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sum = 0;
        boolean areNotIdentical = false;

        for (int i = 0; i < firstArray.length; i++) {
            sum+= firstArray[i];

            if(firstArray[i] != SecondArray[i]){
                areNotIdentical = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }

        }
        if(!areNotIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
