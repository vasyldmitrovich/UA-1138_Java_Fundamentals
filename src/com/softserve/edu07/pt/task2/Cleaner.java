package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    final String TYPE_PERSON = "cleaner";

    @Override
    void print() {
        System.out.print("I am a ");
    }

    @Override
    void salary() {
        System.out.println("7000");
    }
}
