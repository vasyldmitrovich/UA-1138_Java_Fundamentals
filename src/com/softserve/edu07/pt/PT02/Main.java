package com.softserve.edu07.pt.PT02;

public class Main {
    public static void main(String... args) {
        Person[] people = {
                new Teacher("John"),
                new Cleaner("Bob"),
                new Student("Jack"),
        };
        for (var person : people) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("My salary is " + staff.salary());
            }
        }
    }
}
