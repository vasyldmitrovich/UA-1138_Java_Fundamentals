package com.softserve.edu06.pt.task3;

class Point {
    private int x;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}