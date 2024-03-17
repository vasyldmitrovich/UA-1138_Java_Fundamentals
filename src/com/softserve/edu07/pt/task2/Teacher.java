package com.softserve.edu07.pt.task2;

public class Teacher extends Staff {
    final String TYPE_PERSON = "teacher";

    @Override
    void print() {
        System.out.print("I am a ");
    }

    @Override
    void salary() {
        System.out.println("10000");
    }
}
