package com.softserve.edu03.hw;

import java.util.Scanner;

public class HomeTask03 {
    public static void main(String[] args){//Nice very nice
        Person[] person = new Person[5]; // Array for our data
        for (int i = 0; i < 5; i++){
            System.out.println("\nEnter information about person " + (i + 1) + ":"); // i+1 because starting from 0
            person[i] = new Person(); // publish new person to the array
            person[i].input(); // input data for person
        }

        for (int i = 0; i < 5; i++) {
            person[i].output(); // output data for every person from array
        }
        person[2].changeName("Jake", "Sali"); // test change name
        person[2].output();

        Person personNew = new Person("Andy", "Ray"); // test Person constructor
        personNew.setBirthYear(1990);
        personNew.output();

        Person personNew2 = new Person(); // test Person constructor without params
        personNew2.setFirstName("Name");
        personNew2.setLastName("Last Name");
        personNew2.setBirthYear(1990);
        personNew2.output();
    }
}

class Person{// Move to file Person.java
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){

    }
    public Person (String firstName, String lastName){
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
    public void output(){
        System.out.println("\nName: " + getFirstName() + " " + getLastName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age: " + getAge());
    }

    public int getAge() {
        return 2024 - birthYear;
    } // This is not entirely correct, since we have 365 days in a year, but in the task we only need to enter the year
    //Thanks for your attentiveness

    public void changeName(String firstName, String lastName){
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