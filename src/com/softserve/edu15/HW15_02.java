package com.softserve.edu15;

public class HW15_02 {

    public static final String RESOURCE_ONE = "Resource one";
    public static final String RESOURCE_TWO = "Resource two";

    public static void main(String[] args) {
        Thread t1 = new ThreadOne(RESOURCE_ONE, RESOURCE_TWO);
        Thread t2 = new ThreadTwo(RESOURCE_ONE, RESOURCE_TWO);
        t1.start();
        t2.start();
    }
}
