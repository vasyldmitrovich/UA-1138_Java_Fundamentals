package com.softserve.edu03.hw;

import java.util.Scanner;

public class Person {

    private static String firstName;
    private static String lastName;
    Scanner scanner = new Scanner(System.in);
    private int bithYear;

    //Add constructor without parameters

    private Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {//Move main method to some class like App.java
        Person person1 = new Person(firstName, lastName);
        person1.input();
        person1.changeName(firstName, lastName);
        Person person2 = new Person(firstName, lastName);
        person2.input();
        person2.changeName(firstName, lastName);
        Person person3 = new Person(firstName, lastName);
        person3.input();
        person3.changeName(firstName, lastName);
        Person person4 = new Person(firstName, lastName);
        person4.input();
        person4.changeName(firstName, lastName);
        Person person5 = new Person(firstName, lastName);
        person5.input();
        person5.changeName(firstName, lastName);
    }

    private int getAge() {
        bithYear = 2024 - bithYear;
        return bithYear;
    }

    private void input() {
        System.out.println("Input your name");
        firstName = scanner.nextLine();
        System.out.println("Input your surname");
        lastName = scanner.nextLine();
        System.out.println("Input your birthday year");
        bithYear = scanner.nextInt();
        output();
    }

    private void output() {
        System.out.println("Your name is " + firstName);
        System.out.println("Your surname is " + lastName);
        System.out.println("Your age is " + getAge());
    }

    private void changeName(String fn, String ln) {
        System.out.println("if you want to change your name press 1");
        System.out.println("if you don't want to change your name press 0");
        double changeName;
        changeName = scanner.nextInt();
        if (changeName == 1) {
            System.out.println("Input your name");
            firstName = scanner.nextLine();
            System.out.println("Input your surname");
            lastName = scanner.nextLine();
            output();
        } else {
            output();
        }
    }
}
