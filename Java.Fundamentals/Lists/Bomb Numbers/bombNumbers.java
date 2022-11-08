package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(input[0]);
        int bombPower = Integer.parseInt(input[1]);

        int sum = 0;

        while (items.contains(bombNumber)) {
            int indexBomb = items.indexOf(bombNumber);

            int left = Math.max(0, indexBomb - bombPower);
            int right = Math.min(items.size() - 1, indexBomb + bombPower);

            for (int i = right; i >= left; i--) {
                items.remove(i);
            }


        }
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i);
        }
        System.out.println(sum);
    }
}
