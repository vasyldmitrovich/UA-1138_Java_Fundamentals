package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.input();
        System.out.println("Person1: " + person1);

        Person person2 = new Person();
        person2.input();
        System.out.println("Person1: " + person2);

        Person person3 = new Person();
        person3.input();
        System.out.println("Person1: " + person3);

        Person person4 = new Person();
        person4.input();
        System.out.println("Person1: " + person4);

        Person person5 = new Person();
        person5.input();
        System.out.println("Person1: " + person5);

    }
}

class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return 2024 - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first name: ");
        firstName = scanner.nextLine();
        System.out.print("Inout last name: ");
        lastName = scanner.nextLine();
        System.out.print("Input birth year: ");
        birthYear = scanner.nextInt();
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
