package com.softserve.edu06.pt.Task1;


public class ClassB extends ClassA {
    public double i = 1.1;


    @Override
    public void m1() {
        System.out.println("ClassB, metod m1, i=" + i);
// super.m1();
    }

    @Override
    public void m2() {
        System.out.println("ClassB, metod m2, i=" + i);
    }

    @Override
    public void m3() {
        System.out.println("ClassB, metod m3, i=" + i);
    }

    @Override
    public void m4() {
        System.out.println("ClassB, metod m4, i = " + i);
    }

    public void m5() {
        System.out.println("ClassB, metod m5");
    }

    public static void m6() {
        System.out.println("ClassB, static metod m6");
    }


    // private void m8() {
    public void m8() {
        System.out.println("ClassB, metod m8");
    }
}