package com.softserve.edu03.hw;

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

