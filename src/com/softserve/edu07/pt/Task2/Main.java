package com.softserve.edu07.pt.Task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Teacher("David");
        people[1] = new Teacher("Sophia");
        people[2] = new Cleaner("James");
        people[3] = new Cleaner("Emma");
        people[4] = new Student("Oliver");

        for (Person person : people) {
            person.print();
            if (person instanceof Teacher || person instanceof Cleaner) {
                ((Staff) person).salary();
            }
        }
    }
}