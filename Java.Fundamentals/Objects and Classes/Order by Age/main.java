package ObjectsAndClasses.orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        List<Order> OrderList = new ArrayList<>();

        while(!command.equals("End")){
            String name = command.split(" ")[0];
            int ID = Integer.parseInt(command.split(" ")[1]);
            int age = Integer.parseInt(command.split(" ")[2]);

            Order order = new Order(name,ID,age);
            OrderList.add(order);

            command = scanner.nextLine();
        }

        OrderList.sort(Comparator.comparing(Order::getAge));

        for (Order order: OrderList) {
            System.out.println(order);
        }

    }
}
