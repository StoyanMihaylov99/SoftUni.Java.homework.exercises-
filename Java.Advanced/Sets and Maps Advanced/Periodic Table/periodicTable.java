package setsAndMpsAdvanced.exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class periodicTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n  = Integer.parseInt(scanner.nextLine());
        Set<String> set = new TreeSet<>();

        for (int i = 0; i <n ; i++) {
            String[] inputLine = scanner.nextLine().split(" ");

            for (int j = 0; j <inputLine.length ; j++) {
                set.add(inputLine[j]);
            }
        }


        for (String  element: set) {
            System.out.print(element + " ");
        }
    }}
