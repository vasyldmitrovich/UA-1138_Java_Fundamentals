package com.softserve.edu06.pt.Task1;

public class ClassB extends ClassA {
    public double i = 1.1;

    @Override
    public void m1() {
        System.out.println("ClassB, method m1, i=" + i);
        super.m1();
    }

    @Override
    public void m4() {
        System.out.println("ClassB, method m4, i = " + i);
    }

    public void m5() {
        System.out.println("ClassB, method m5");
    }

    public static void m6() {
        System.out.println("ClassB, static method m6");
        ClassA.m6();
    }
}