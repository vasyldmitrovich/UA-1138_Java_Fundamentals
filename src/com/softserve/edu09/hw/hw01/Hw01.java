package com.softserve.edu09.hw.hw01;

import java.util.*;

public class Hw01 {
    public static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();
        int n = 1;
        do {
            System.out.print("num " + n + ": ");
            int num = scanner.nextInt();
            myCollection.add(num);
            n++;
        } while (myCollection.size() != 10);

        System.out.println("Original: " + myCollection);

        swap(myCollection);
        negativeNum(myCollection);
        System.out.println(zero(myCollection));
        System.out.println("Reverse: " + reverseOrder(myCollection));

        System.out.println(removeLastEvenElement(myCollection));
        System.out.println(removeFollowingElement(myCollection));
    }

    private static void swap(List<Integer> myCollection) {
        Collections.sort(myCollection);
        int min = myCollection.getFirst();
        int max = myCollection.getLast();
        myCollection.removeFirst();
        myCollection.removeLast();
        myCollection.add(0, max);
        myCollection.add(myCollection.size(), min);
        text("Swap: ", myCollection);
    }

    private static void negativeNum(List<Integer> myCollection) {

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, RANDOM.nextInt(100, 999));
                break;
            }
        }

        text("Negative num: ", myCollection);
    }

    private static List<Integer> zero(List<Integer> myCollection) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            result.add(myCollection.get(i));
            if (i < myCollection.size() - 1 && haveDifferentSigns(myCollection.get(i), myCollection.get(i + 1))) {
                result.add(0);
            }
        }

        text("Zero between: ", myCollection);
        return result;
    }

    private static boolean haveDifferentSigns(int a, int b) {
        return (a < 0 && b >= 0) || (a >= 0 && b < 0);
    }

    private static List<Integer> reverseOrder(List<Integer> myCollection) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(myCollection.get(i));
        }
        for (int i = myCollection.size() - 1; i >= 5; i--) {
            result.add(myCollection.get(i));
        }
        return result;
    }

    private static List<Integer> removeLastEvenElement(List<Integer> myCollection) {
        List<Integer> result = new ArrayList<>(myCollection);
        int counter = 0;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (result.get(i) % 2 == 0) {
                result.remove(i);
                break;
            } else if (counter == myCollection.size() - 1) {
                System.out.println("Is no such element");
            }
            counter++;
        }
        return result;
    }

    private static List<Integer> removeFollowingElement(List<Integer> myCollection){
        List<Integer> result = new ArrayList<>(myCollection);
        int min = Collections.min(result);
        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i) == min){
                result.remove(i + 1);
                break;
            }
        }
        return result;
    }

    private static void text(String txt, List<Integer> myCollection) {
        System.out.println("*".repeat(40));
        System.out.println(txt + myCollection);
    }
}
