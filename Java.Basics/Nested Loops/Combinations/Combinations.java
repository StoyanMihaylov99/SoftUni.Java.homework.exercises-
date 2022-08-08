package NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int x1 = 0; x1 <=input ; x1++) {
            for (int x2 = 0; x2 <=input; x2++) {
                for (int x3 = 0; x3 <=input; x3++) {
                    int sum = x1+x2+x3;
                    if(sum == input){
                        counter++;
                        break;
                    }
                    }
                }

            }
        System.out.println(counter);

        }
    }
