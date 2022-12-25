package regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String namesParticipants = scanner.nextLine();
        List<String> names = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());


        Map<String, Integer> racerDistance = new LinkedHashMap<>();
        names.forEach(name -> racerDistance.put(name, 0));


        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexNumbers = "[0-9]";
        Pattern patternNumbers = Pattern.compile(regexNumbers);


        String input = scanner.nextLine();

        while (!input.equals("end of race")) {

            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);

            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }

            int distance = 0;

            Matcher matcherNumbers = patternNumbers.matcher(input);

            while (matcherNumbers.find()) {
                distance += Integer.parseInt(matcherNumbers.group());
            }

            if (names.contains(racerName.toString())) {
                int currentDistance = racerDistance.get(racerName.toString());
                racerDistance.put(racerName.toString(), currentDistance + distance);
            }
        }

        int count = 1; //реда на текущия играч
        for (Map.Entry<String, Integer> pair : racerDistance.entrySet()) {
            //pair: име -> дистанция
            if (count == 1) {
                //първия играч
                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                //втория играч
                System.out.println("2nd place: " + pair.getKey());
                count++;
            } else if (count == 3) {
                //третия играч
                System.out.println("3rd place: " + pair.getKey());
                break;


            }
        }
    }
}

