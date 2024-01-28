package com.softserve.edu01.pt;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void  task1(){
        String firstString;
        String secondString;
        String thirdString;

        System.out.println("Input text:");
        firstString = scanner.nextLine();
        secondString = scanner.nextLine();
        thirdString = scanner.nextLine();

        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);
    }

    public static void task2(){
        float firstNumber;
        float secondNumber;
        float thirdNumber;
        double mid;

        System.out.println("Input first number:");
        firstNumber = scanner.nextFloat();
        System.out.println("Input second number:");
        secondNumber = scanner.nextFloat();
        System.out.println("Input third number:");
        thirdNumber = scanner.nextFloat();

        mid = (firstNumber + secondNumber+ thirdNumber)/3;
        System.out.println("Average is "+ mid);
    }
    public static void task3(){
        float a;
        float b;
        double c;

        System.out.println("Input values a:");
        a = scanner.nextFloat();
        System.out.println("Input values b:");
        b = scanner.nextFloat();

        c = a+b;
        System.out.println("a + b = " + c);

        c= a-b;
        System.out.println("a - b = " + c);

        c= a*b;
        System.out.println("a * b = " + c);

        c= a/b;
        System.out.println("a / b = " + c);
    }
    public static void task4(){
        String answer;

        System.out.println("How are you?");
        answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }
}
