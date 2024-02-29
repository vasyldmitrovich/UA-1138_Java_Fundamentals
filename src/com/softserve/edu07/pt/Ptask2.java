package com.softserve.edu07.pt;

public class Ptask2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher("Jain"),
                new Cleaner("Luke"),
                new Student("Mike"),
        };
        for (var person : persons) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("My salary is " + staff.salary());
            }
        }
    }
}

abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}

abstract class Staff extends Person {
    public Staff(String name) {
        super(name);
    }

    abstract int salary();
}

class Teacher extends Staff {
    static final String Type_Person = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + Type_Person);
    }

    @Override
    int salary() {
        return 15_000;
    }
}

class Cleaner extends Staff {
    static final String Type_Person = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + Type_Person);
    }

    @Override
    int salary() {
        return 10_000;
    }
}

class Student extends Person {
    static final String Type_Person = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + Type_Person);
    }
}
