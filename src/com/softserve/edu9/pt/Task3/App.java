package com.softserve.edu9.pt.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            myCollection.add(randomNumber);
        }
        List<Integer> copyMyCollection = new ArrayList<>(myCollection);

        // Find and put element to newCollection if element > 5
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);


        // Remove element from myCollection if element > 20
        for (int i = myCollection.size()-1; i >= 0; i--) {
            if(myCollection.get(i) > 20 ) {
                myCollection.remove(myCollection.get(i));
            }
        }
        System.out.println(myCollection);


        copyMyCollection.add(2, 1);
        copyMyCollection.add(8, -3);
        copyMyCollection.add(5, -4);

        System.out.println(copyMyCollection);

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}
