package com.softserve.edu07.pt.pt02;

public class Teacher extends Staff {
    public Teacher(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.print("4000");
    }
}
