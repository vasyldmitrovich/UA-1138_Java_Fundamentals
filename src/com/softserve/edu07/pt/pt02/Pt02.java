package com.softserve.edu07.pt.pt02;

public class Pt02 {
    public static void main(String[] args) {
        Person[] peoples = {
//                new Student("Bob"),
                new Teacher("Alice"),
                new Cleaner("Jack"),
        };

        for (var people : peoples) {
            people.print();
        }

        Teacher teacher = new Teacher("Vova");
        teacher.salary();
    }
}
