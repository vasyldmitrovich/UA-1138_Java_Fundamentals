package com.softserve.edu07.pt;

public class Pt2 {
    public static void main(String[] args) {
        Person[] people = {
                new Cleaner("Tom"),
                new Student("Jack"),
                new Teacher("Alice")
        };

        for (Person person : people) {
            person.print();
            if (person instanceof Teacher) {
                ((Teacher) person).salary();
            } else if (person instanceof Cleaner) {
                ((Cleaner) person).salary();
            } else if (person instanceof Student) {
                ((Student) person).salary();
            }
        }
    }
}

