package com.softserve.edu09.pt.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Positions of elements greater than 5: " + newCollection);

        myCollection.removeIf(element -> element > 20);
        System.out.println("myCollection after removing elements greater than 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("After inserting elements:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }

        myCollection.sort(null);
        System.out.println("Sorted collection: " + myCollection);
    }
}