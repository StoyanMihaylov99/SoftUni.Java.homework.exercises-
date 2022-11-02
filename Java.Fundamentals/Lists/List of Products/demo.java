import java.util.*;
import java.util.List;



public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<String> items = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            items.add(scanner.nextLine());
        }


        Collections.sort(items);

        for (int i = 0; i <n ; i++) {
            System.out.printf("%d.%s%n", i + 1, items.get(i));
        }
    }
}







