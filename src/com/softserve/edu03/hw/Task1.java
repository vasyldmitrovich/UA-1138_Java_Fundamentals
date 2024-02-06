package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Task1.task1();
    }

    public static double task1() {
//      Define triangle sides
        System.out.println("Enter the length of the first side");
        int firstSide = SCANNER.nextInt();

        System.out.println("Enter the length of the second side");
        int secondSide = SCANNER.nextInt();

        System.out.println("Enter the length of the third side");
        int thirdSide = SCANNER.nextInt();
//      Calculate perimeter
        double trianglePerimeter = (firstSide + secondSide + thirdSide);

//      Calculate perimeter divided by 2
        double dividedPerimeter = trianglePerimeter/2;
        System.out.println(dividedPerimeter);

//      Calculate area
        double triangleArea = Math.sqrt(dividedPerimeter * (dividedPerimeter - firstSide) * (dividedPerimeter - secondSide) * (dividedPerimeter - thirdSide));

        System.out.println(triangleArea);
        return triangleArea;
    }
}
