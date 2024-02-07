/*
package com.softserve.edu03.pt;

import java.lang.*;
import java.util.*;

public class PrTask01 {
    public static void main (String...args){
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number: ");
        int sum = getTotal(first, second);
        double average = getAverage(first, second);
        System.out.println("The sum of " + first + " and " + second + " is " + sum);
        System.out.println("The average of " + first + " and " + second + " is " + average);

    }

    private static double getAverage(int first, int second) {
        return getTotal(first, second) / 2.0;
    }

    private static int getTotal(int first, int second) {
        return first + second;
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}
*/



// My solution before watching videos


//If your new solution is better, you could delete the oldest solution
 package com.softserve.edu03.pt;

 import java.lang.*;
 import java.util.*;

public class PrTask01 {
    public static void main (String... args){//Add spaces for good readable of code
        int value1 = getNumber("Enter first number: ");
        int value2 = getNumber("Enter second number: ");
        int sum = getTotal(value1, value2);
        double average = getAverage(value1, value2);
        System.out.println("The sum of " + value1 + " and " + value2 + " is " + sum);
        System.out.println("The average of " + value1 + " and " + value2 + " is " + average);
    }
    public static int getNumber(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getTotal(int value1, int value2){
        return value1 + value2;
    }
    public static double getAverage(int value1, int value2){
        return (value1 + value2) / 2.0;
    }
}
