package com.softserve.edu07.pt.task2;

public class PrTask2 {//Here all good
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Bob"),
                new Teacher("Alice"),
                new Cleaner("John")
        };

        for (var person : persons) {
            person.print();
        }

        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.salary();
            }
            if (person instanceof Cleaner) {
                Cleaner cleaner = (Cleaner) person;
                cleaner.salary();
            }
        }


    }
}
