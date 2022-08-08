package conditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        switch(product){
            case "coffee":
                    if (town.equals("Sofia")){
                        price = 0.50;}
                    else if (town.equals("Plovdiv")) {
                        price = 0.40;}
                    else if (town.equals("Varna")) {
                        price = 0.45;}
                    break;

            case "water":
                if(town.equals("Sofia")){
                        price = 0.80;}
                else if (town.equals("Plovdiv")){
                        price = 0.70;}
                else if (town.equals("Varna")){
                        price = 0.70;}
                break;

                case "beer":
                    if(town.equals("Sofia")){
                        price = 1.20;}
                    else if(town.equals("Plovdiv")){
                        price = 1.15;}
                    else if(town.equals("Varna")){
                        price = 1.10;}
                    break;
            case "sweets":
                  if(town.equals("Sofia")){
                            price = 1.45;}
                  else if(town.equals("Plovdiv")){
                            price = 1.30;}
                  else if(town.equals("Varna")){
                            price = 1.35;}
                  break;
            case "peanuts":
                  if(town.equals("Sofia")){
                        price = 1.60;}
                  else if(town.equals("Plovdiv")){
                        price = 1.50;}
                  else if(town.equals("Varna")){
                        price = 1.55;}
                  break;

                        }                 System.out.println(price * amount);

    }

        }



