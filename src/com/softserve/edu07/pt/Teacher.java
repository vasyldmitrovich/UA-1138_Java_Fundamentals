package com.softserve.edu07.pt;

public class Teacher extends Staff {
    private double salary;

    public Teacher(String name, double salary) {
        super(name, "Teacher");
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " + name + ".");
    }

    @Override
    public void salary() {
        System.out.println("Salary of " + TYPE_PERSON + " " + name + ": $" + salary);
    }
}
