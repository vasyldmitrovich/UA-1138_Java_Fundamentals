package com.softserve.edu6.pt.task3;

public class Line {
    Point coordinates1;
    Point coordinates2;

    Line(Point coordinates1, Point coordinates2) {
        this.coordinates1 = coordinates1;
        this.coordinates2 = coordinates2;
    }

    Point getCoordinates1() {
        return coordinates1;
    }

    Point getCoordinates2() {
        return coordinates2;
    }

    void print() {
        System.out.println("This is a line. " +
                "Coordinates of the first point: " + getCoordinates1().getX() + ", " + getCoordinates1().getY() +
                ". Coordinates of the second point: " + getCoordinates2().getX() + ", " + getCoordinates1().getY());
    }
}
