package Lists.Exercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHande = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHande = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstHande.size() > 0 && secondHande.size() > 0) {

            int firstHandeCard = firstHande.get(0);
            int secondHandeCard = secondHande.get(0);

            if (firstHandeCard > secondHandeCard) {
                firstHande.add(firstHandeCard);
                firstHande.add(secondHandeCard);
                firstHande.remove(0);
                secondHande.remove(secondHande.get(0));


            } else if (firstHandeCard < secondHandeCard) {
                secondHande.add(secondHandeCard);
                secondHande.add(firstHandeCard);
                secondHande.remove(0);
                firstHande.remove(firstHande.get(0));

            } else {
                firstHande.remove(firstHande.get(0));
                secondHande.remove(secondHande.get(0));

            }
        }

        int sum = 0;
        if (firstHande.size() > 0) {
            for (int i = 0; i < firstHande.size(); i++) {
                sum += firstHande.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < secondHande.size(); i++) {
                sum += secondHande.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}



