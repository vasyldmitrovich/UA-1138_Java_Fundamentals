package com.softserve.edu03.hw.person;

public class App {
    public static void main(String[] args) {//Move main method to some class like App.java
        Person person1 = new Person();
        Person.input(person1);
        person1.changeName();
        person1.output();

        Person person2 = new Person();
        Person.input(person2);
        person2.output();

        Person person3 = new Person();
        Person.input(person3);
        person3.output();

        Person person4 = new Person();
        Person.input(person4);
        person4.output();

        Person person5 = new Person();
        Person.input(person5);
        person5.output();
    }
}
