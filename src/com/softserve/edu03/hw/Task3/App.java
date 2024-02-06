package com.softserve.edu03.hw.Task3;

public class App {
    public static void main(String[] args) {
        Person person1 = Person.input();
        Person person2 = Person.input();
        Person person3 = Person.input();
        Person person4 = Person.input();
        Person person5 = Person.input();
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

        person1.changeName(null, "Piatochkin");
        person1.output();
    }
}
