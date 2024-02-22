package com.softserve.edu07.pt.pt02;

public class Cleaner extends Staff {
    public Cleaner(String name) {
        super(name);
    }

    @Override
    void salary() {
        System.out.print("8000");
    }
}
