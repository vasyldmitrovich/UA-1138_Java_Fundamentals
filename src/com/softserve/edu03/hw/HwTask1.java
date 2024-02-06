package com.softserve.edu03.hw;

import java.util.Scanner;

public class HwTask1 {
    public static void main(String[] args) {
        int first = getSides("Input the first side: ");
        int second = getSides("Input the second side: ");
        int third = getSides("Input the third side: ");

        double area = getArea(first, second, third);
        System.out.println("The area of triangle is: " + area);
    }

    private static int getSides(String prompt) {//Good
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    //without cheching of existence trian
    private static double getArea(int first, int second, int third) {
        double halfPerim = (double) (first + second + third) / 2;
        return Math.sqrt(halfPerim * (halfPerim - first) * (halfPerim - second) * (halfPerim - third));
    }

}
