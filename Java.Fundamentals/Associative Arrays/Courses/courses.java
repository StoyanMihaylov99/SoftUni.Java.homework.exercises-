package AssociativeArrays.Exercises;

import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> courseList = new LinkedHashMap<>();
        List<String> userList = new ArrayList<>();

        while(!command.equals("end")){
            String course = command.split(" : ")[0];
            String user = command.split(" : ")[1];

            if(!courseList.containsKey(course)){
                courseList.put(course, new ArrayList<>());
            }

           courseList.get(course).add(user);

            command = scanner.nextLine();
        }


        courseList.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        });
        }

    }

