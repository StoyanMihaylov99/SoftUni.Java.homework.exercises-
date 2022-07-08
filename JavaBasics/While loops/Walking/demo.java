import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stepsCounter = 0;
        int goal = 10000;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            stepsCounter += steps;
            if (stepsCounter >= goal){
                break;
            }
            input = scanner.nextLine();
        }
        int allSteps = stepsCounter;
        if(input.equals("Going home")){
            int goingHomeCount = Integer.parseInt(scanner.nextLine());
            allSteps = stepsCounter + goingHomeCount; }

        if (allSteps >= goal) {
            System.out.println("Goal reached! Good job!");
            if (allSteps > goal) {
                System.out.printf("%d steps over the goal!", Math.abs(goal - allSteps));
            }
        }


        if (allSteps < goal){
            System.out.printf("%d more steps to reach goal.", goal - allSteps);
        }
    }


}

