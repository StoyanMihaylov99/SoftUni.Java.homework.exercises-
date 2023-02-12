package setsAndMpsAdvanced;

import java.util.*;

public class academyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> gradesMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();


            gradesMap.putIfAbsent(name, new ArrayList<>());

            for (double grade : grades) {
                gradesMap.get(name).add(grade);
            }

        }


        gradesMap.forEach((key, value) -> {
            double sumOfGrades = 0;
            for (Double grade : value) {
                sumOfGrades += grade;
            }
            System.out.printf("%s is graduated with %s%n", key, sumOfGrades / value.size());


        });
    }
}

