package com.softserve.edu07.pt.Task2;

public class App {
    public static void main(String[] args) {
        Person[] people = {
                new Cleaner("Alex"),
                new Teacher("Marta"),
                new Student("John")
        };

        for (Person person:
             people) {
            person.print();
            if (person instanceof Staff) {
                System.out.println(". My salary is " + ((Staff) person).salary());
            }
        }
    }
}
