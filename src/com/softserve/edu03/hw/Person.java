package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
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

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentyear = LocalDate.now().getYear();
        return currentyear - birthYear;
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first name:");
        this.firstName = scanner.nextLine();

        System.out.println("Input the last name:");
        this.lastName = scanner.nextLine();

        System.out.println("Input the birth year:");
        this.birthYear = scanner.nextInt();
    }
}
