package com.softserve.edu06.pt.task3;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    void print() {
        System.out.println("This is the point");
    }
}
