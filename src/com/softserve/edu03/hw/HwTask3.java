package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class HwTask3 {
    public static void main(String[] args) {
        Person person = new Person();
        Person.input(person);
        Person.output(person);
    }
}

class Person {//Move this class to file Person.java
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private static int getAge(int birthYear) {
        return LocalDate.now().getYear() - birthYear;
    }

    public static void input(Person person) {//Move this and next method after getters and setters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть імя: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);
        System.out.println("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Введіть рік народження: ");
        int birthYear = Integer.parseInt(scanner.nextLine());
        person.setBirthYear(birthYear);
    }

    public static void output(Person person) {
        System.out.println("Імя: " + person.getFirstName());
        System.out.println("Прізвище: " + person.getLastName());
        System.out.println("Рік народження: " + person.getBirthYear());

        int age = getAge(person.getBirthYear());
        System.out.println("Вік: " + age);
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}

