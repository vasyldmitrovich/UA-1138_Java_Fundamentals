package com.softserve.edu09.pt.pt03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pt03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();
        int n = 1;
        do {
            System.out.print("num " + n + ": ");
            int num = scanner.nextInt();
            myCollection.add(num);
            n++;
        } while (myCollection.size() != 10);

        System.out.println("Original collection " + myCollection);

        for (var num : myCollection) {
            if (num > 5) {
                newCollection.add(num);
            }
        }

        System.out.println("New collection " + newCollection);

        myCollection.removeIf(element -> element > 20);

        System.out.println("*".repeat(40));
        System.out.println("Update myCollection " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("Sorted Collection: " + myCollection);
    }
}
