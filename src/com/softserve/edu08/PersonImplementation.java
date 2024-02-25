package com.softserve.edu08;

public class PersonImplementation extends Person {

    public PersonImplementation(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return null;
    }

    public static void main(String[] args) {
        FullName fullName = new FullName();
        fullName.setFirstName("Alex");
        fullName.setLastName("Yang");
        PersonImplementation implementation = new PersonImplementation(fullName, 30);
        System.out.println(implementation.info());
    }
}
