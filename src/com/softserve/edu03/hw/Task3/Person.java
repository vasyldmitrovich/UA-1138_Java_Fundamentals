package com.softserve.edu03.hw.Task3;

import java.util.Calendar;
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
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        Calendar rightNow = Calendar.getInstance();
        rightNow.roll(Calendar.YEAR, -birthYear);
        return rightNow.getWeekYear();
    }

    public void output() {
        System.out.println("Person name is: " + firstName +
                "\nPerson last name is: " + lastName +
                "\nPerson age is: " + this.getAge());
    }

    public static Person input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person name");
        String firstName = scanner.nextLine();
        System.out.println("Enter person last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter year of birth");
        int birthYear = scanner.nextInt();

        return new Person(firstName, lastName, birthYear);
    }

    public void changeName(String fn, String ln) {
        if (fn != null) {
            this.firstName = fn;
        }
        if (ln != null) {
            this.lastName = ln;
        }
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