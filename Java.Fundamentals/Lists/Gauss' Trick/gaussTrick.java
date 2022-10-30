package Lists;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class gaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= items.size() / 2; i++) {
            items.set(i, items.get(i) + items.get(items.size() - 1));
            items.remove(items.size() - 1);
        }
        print(items);

    }
    private static List<Integer> print (List<Integer> items){
        for (int element: items) {
            System.out.print(element + " ");
        }
        return items;
    }
}
