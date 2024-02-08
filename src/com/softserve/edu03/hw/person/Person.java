package com.softserve.edu03.hw;

import java.time.Year;
import java.util.Scanner;

public class Person {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

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

    public static int getAge(int birthYear){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public void changeName(){
        System.out.println("New name: ");
        setFirstName(SCANNER.nextLine());
        System.out.println("New surname: ");
        setLastName(SCANNER.nextLine());
    }

    public void output(){
        System.out.println("Name: " + firstName + ".\nSurname: " + lastName
                + ".\nBirth year: " + birthYear
                + ".\nAge: " + getAge(birthYear) );
    }

    public static void input(Person person){
        System.out.println("Please input name: ");
        String name = SCANNER.nextLine();
        person.setFirstName(name);
        System.out.println("Please input surname: ");
        String surname = SCANNER.nextLine();
        person.setLastName(surname);
        System.out.println("Please input birth year: ");
        int birthYear = SCANNER.nextInt();
        person.setBirthYear(birthYear);
        SCANNER.nextLine();
    }

}
