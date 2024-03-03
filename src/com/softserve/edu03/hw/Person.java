package com.softserve.edu03.hw;

import java.util.Scanner;

class Person {// Move to file Person.java
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("Enter birth year: ");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("\nName: " + getFirstName() + " " + getLastName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age: " + getAge());
    }

    public int getAge() {
        return 2024 - birthYear;
    } // This is not entirely correct, since we have 365 days in a year, but in the task we only need to enter the year
    //Thanks for your attentiveness

    public void changeName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}
