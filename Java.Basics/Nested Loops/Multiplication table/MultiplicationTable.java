package NestedLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x1 = 1; x1 <=10 ; x1++) {
            for (int x2 = 1; x2 <=10 ; x2++) {
                int sum = x1 * x2;
                System.out.printf("%d * %d = %d %n", x1,x2,sum);

            }

        }
    }
}
