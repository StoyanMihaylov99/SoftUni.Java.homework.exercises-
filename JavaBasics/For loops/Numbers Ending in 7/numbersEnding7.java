package ForLoopsExersice;

public class numbersEnding7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i += 1) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
