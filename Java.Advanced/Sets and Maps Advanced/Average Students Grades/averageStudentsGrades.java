package setsAndMpsAdvanced;

import java.util.*;

public class averageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        Map<String,List<Double>> gradesList = new TreeMap<>();
        List<Double> grades = new ArrayList<>();


        for (int i = 0; i <input ; i++) {
            String currentInput = scanner.nextLine();
            String name = currentInput.split(" ")[0];
            double currentGrade = Double.parseDouble(currentInput.split(" ")[1]);

         
             gradesList.putIfAbsent(name, new ArrayList<>());
             gradesList.get(name).add(currentGrade);

            }

        for (Map.Entry<String, List<Double>> entry : gradesList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double averageSum = 0;
            for (Double grade: entry.getValue()) {
                System.out.printf("%.2f ",grade);
                averageSum += grade;
            }
            System.out.printf("(avg: %.2f)%n", averageSum / entry.getValue().size());
        }

    }


    }
        


    

