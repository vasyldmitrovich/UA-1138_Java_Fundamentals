package com.softserve.edu03.hw;

import java.util.Scanner;

public class HomeTask03 {
    public static void main(String[] args){
        System.out.println("Enter information about person 1:");
        Person person1 = new Person();
        person1.input();

        System.out.println("Enter information about person 2:");
        Person person2 = new Person();
        person2.input();

        System.out.println("Enter information about person 3:");
        Person person3 = new Person();
        person3.input();

        System.out.println("Enter information about person 4:");
        Person person4 = new Person();
        person4.input();

        System.out.println("Enter information about person 5:");
        Person person5 = new Person();
        person5.input();


        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}

class Person{
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
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Birth year: " + getBirthYear());
        System.out.println("Age: " + getAge());
    }

    public int getAge() {
        return 2024 - birthYear;
    }

    public void changeName(){
        input(); // No ideas
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