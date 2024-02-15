package com.softserve.edu07.pt;

public class Cleaner extends Staff {
    private double salary;

    public Cleaner(String name, double salary) {
        super(name, "Cleaner");
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
