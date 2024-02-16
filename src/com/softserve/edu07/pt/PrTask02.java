package com.softserve.edu07.pt;

public class PrTask02 {//Ok
    public static void main(String[] args) {
        Person[] people = {
                new Teacher("John", 25_000),
                new Cleaner("Alice", 14_000),
                new Student("Bob"),
        };

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
            System.out.println();
        }
    }
}
