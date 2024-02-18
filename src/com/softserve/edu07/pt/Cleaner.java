package com.softserve.edu07.pt;

class Cleaner extends Person {
    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner - " + getName());
    }

    public void salary() {
        System.out.println("I earn 2.000$ per month");
    }
}
