package com.softserve.edu04.hw;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static Scanner scanner = new Scanner(in);
    public static void main(String[] args) {
        // Task 1
//        App.task1();

        // Task 2
//        App.task2();

        // Task 3
//        App.task3();

        // Task 4
//        Faculty faculty = Faculty.createFaculty();
//        faculty.getCurrentSeason().printGetSemester();
//        System.out.println(faculty.getNumberOfStudents());

        // Task 5
        Dog dog1 = new Dog("Bobik", Dog.Breed.BULLDOG, 5);
        Dog dog2 = new Dog("Sharik", Dog.Breed.BOXER, 6);
        Dog dog3 = new Dog("Laika", Dog.Breed.BEAGLE, 7);
        boolean isDoubleName = dog1.equals(dog2) ||
                               dog1.equals(dog3) ||
                               dog2.equals(dog3) ||
                               dog2.equals(dog1) ||
                               dog3.equals(dog1) ||
                               dog3.equals(dog2);
        System.out.println(isDoubleName);

        Dog theOldestDog = dog1;
        if(dog2.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog2;
        }
        if(dog3.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog3;
        }

        System.out.println("The name of the oldest dog is " + theOldestDog.getName() +
                            ". His breed is " + theOldestDog.getBreed());
    }

    public static void task1() {
        System.out.println("Enter the first number");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        float secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        float thirdNumber = scanner.nextInt();

        if ((firstNumber <= 5 && firstNumber >=-5) &&
            (secondNumber <= 5 && secondNumber >=-5) &&
            (thirdNumber <= 5 && thirdNumber >=-5)
        ) {
            System.out.println("All numbers belongs to range");
        } else {
            System.out.println("One of the number out of range");
        }
    }

    public static void task2() {
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

        int theLargestestNumber = 0;

        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            theLargestestNumber = firstNumber;
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            theLargestestNumber = secondNumber;
        } else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            theLargestestNumber = thirdNumber;
        }

        System.out.println("The smallest number is " + theSmallestNumber);
        System.out.println("The largest number is " + theLargestestNumber);
    }

    public static void task3() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the error code: ");
        int errorCode = scanner.nextInt();
        switch (errorCode) {
            case 404 -> HTTPError.ERROR_404.printErrorName();
            case 500 -> HTTPError.ERROR_500.printErrorName();
            case 502 -> HTTPError.ERROR_502.printErrorName();
        }
    }

    public enum HTTPError {
        ERROR_404, ERROR_502, ERROR_500;

        public void printErrorName() {
            switch (this) {
                case ERROR_404 -> System.out.println("Not Found");
                case ERROR_500 -> System.out.println("Internal Server Error");
                case ERROR_502 -> System.out.println("Bad Gateway");
            }
        }
    }

}
