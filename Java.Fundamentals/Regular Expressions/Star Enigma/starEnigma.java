package regex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesCount = Integer.parseInt(scanner.nextLine());
        List<String> messages = new ArrayList<>();

        for (int i = 0; i < messagesCount; i++) {
            String encrypted = scanner.nextLine();
            int count = 0;

            // proverka
            for (int j = 0; j < encrypted.length(); j++) {
                Character.toLowerCase(encrypted.charAt(j));
                if (Character.toLowerCase(encrypted.charAt(j)) == 's' || Character.toLowerCase(encrypted.charAt(j)) == 't' || Character.toLowerCase(encrypted.charAt(j)) == 'a' || Character.toLowerCase(encrypted.charAt(j)) == 'r') {
                    count++;
                }
            }

            //decriptvane
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < encrypted.length(); j++) {
                int currentChar = encrypted.charAt(j) - count;
                char newChar = (char) currentChar;
                stringBuilder.append(newChar);

            }
            messages.add(stringBuilder.toString());


        }
        List<String> AttackedPlanets = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        int attackCount = 0;
        int destroyedPlanets = 0;
        for (String currentMessage : messages) {
            String regex = "@(?<PlanetName>[A-Za-z]+)[0-9]?[^@\\-!:>.]?:(?<population>[0-9]+)[^@\\-!:>.]?!(?<attackType>[A-Z]+)![^@\\-!:>.]?->(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(currentMessage);

            if (matcher.find()) {

                String planetName = matcher.group("PlanetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int solderCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackCount++;
                    AttackedPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanets++;
                    destroyed.add(planetName);
                }


            }
        }

        System.out.printf("Attacked planets: %d%n", attackCount);
        Collections.sort(AttackedPlanets);
        for (String planet : AttackedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets);
        Collections.sort(destroyed);
        for (String planet : destroyed) {
            System.out.printf("-> %s%n", planet);
        }


    }
}
