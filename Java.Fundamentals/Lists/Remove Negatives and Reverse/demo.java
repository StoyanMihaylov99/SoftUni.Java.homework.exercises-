import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> items = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        boolean isEmpty = false;
        for (int i = 0; i <items.size() ; i++) {
            if(items.get(i) < 0){
                items.remove(i);
                i -= 1;
            }
        }
        Collections.reverse(items);
        if(items.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(items.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}









