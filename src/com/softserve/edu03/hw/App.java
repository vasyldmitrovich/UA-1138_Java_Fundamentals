package com.softserve.edu03.hw;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {//All good but uncomment task 1 and task 2
        // Task 1
//        App.task1();

        // Task 2
//        App.task2();

        // Task 3
        App.task3();

    }

    public static double task1() {
//      Define triangle sides
        System.out.println("Enter the length of the first side");
        int firstSide = scanner.nextInt();

        System.out.println("Enter the length of the second side");
        int secondSide = scanner.nextInt();

        System.out.println("Enter the length of the third side");
        int thirdSide = scanner.nextInt();
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

    public static int task2() {
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();

        int theSmallestNumber = 0;

        if(firstNumber < secondNumber && firstNumber < thirdNumber) {
            theSmallestNumber = firstNumber;
        } else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            theSmallestNumber = secondNumber;
        } else if(thirdNumber < firstNumber && thirdNumber < secondNumber){
            theSmallestNumber = thirdNumber;
        }

        System.out.println(theSmallestNumber);
        return theSmallestNumber;
    }

    public static void task3() {
        Person person1 = Person.input();
//        Person person2 = Person.input();
//        Person person3 = Person.input();
//        Person person4 = Person.input();
//        Person person5 = Person.input();
//        person1.output();
//        person2.output();
//        person3.output();
//        person4.output();
//        person5.output();

        person1.changeName(null, "Piatochkin");
        person1.output();
    }

}
