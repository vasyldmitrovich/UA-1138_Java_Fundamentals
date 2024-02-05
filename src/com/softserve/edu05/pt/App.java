package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        // Task 1
//        App.task1();
        // Task 2
//        App.task2();
        // Task 3
//        App.task3();

        // Task 4
        App.task4();

    }

    public static void task1() {
        // Sort array
        String[] stringArray = {"G", "2A", "1A", "F", "B", "EB", "D", "EA", "C"};
        String[] arrayToSort = stringArray.clone();
        Arrays.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        // Get average value
        int[] numbersArray = {5, 3, 7, 3, 2};
        int sum = 0;
        for (int number : numbersArray) {
            sum += number;
        }
        double average = sum / (double) numbersArray.length;
        System.out.println(average);

        // Find element
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the value you want to search: ");
        String valueToFind = scanner.nextLine();
        boolean isFound = false;
        for (var element : stringArray) {
            if (element.equals(valueToFind)) {
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println("The value \"" + valueToFind + "\" is on the list");
        } else {
            System.out.println("The value \"" + valueToFind + "\" not found");
        }

        int isFoundInSortedArray = Arrays.binarySearch(arrayToSort, valueToFind);
        if (isFoundInSortedArray >= 0) {
            System.out.println("The value \"" + valueToFind + "\" is on the list");
            System.out.println(isFoundInSortedArray);
        } else {
            System.out.println("The value \"" + valueToFind + "\" not found");
            System.out.println(isFoundInSortedArray);

        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter a number: ");
        int number = Math.abs(scanner.nextInt());
        boolean isPrime = number != 1;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }

    }

    public static void task3() {
        int[] array = generateRandomNumbers(10);
        System.out.println(Arrays.toString(array));
        System.out.println("The max value is: " + max(array));
        System.out.println("The sum of positive values: " + sumOfPositives(array));
        System.out.println("The number of negative values: " + countOfNegatives(array));

        int countPositives = countOfPositives(array);
        int countNegatives = countOfNegatives(array);
        if (countNegatives > countPositives) {
            System.out.println("There are more negative values in the array.");
        } else if (countPositives > countNegatives) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    public static int[] generateRandomNumbers(int quantity) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        return array;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static long sumOfPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int countOfNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOfPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    public static void task4() {
        Employee[] employees = {
                new Employee("Alice", 1, 10000),
                new Employee("Bob", 2, 11000),
                new Employee("Jack", 2, 12000),
                new Employee("John", 3, 14000),
                new Employee("Mark", 3, 13000),

        };

        System.out.print("Enter department number: ");
        Scanner scanner = new Scanner(in);
        int i = scanner.nextInt();
        boolean isFound = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == i) {
                System.out.println(employee);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("There are no employees from this department");
        }

        sort(employees);
        System.out.println(Arrays.toString(employees));
    }

    public static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }

            }

        }
    }
}