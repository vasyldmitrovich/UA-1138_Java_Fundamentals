package com.softserve.edu06.pt.task3;

public class ColorLine extends Line {
    String color;

    ColorLine(Point coordinates01, Point coordinates02, String color) {
        super(coordinates01, coordinates02);
        this.color = color;
    }

    void print() {
        System.out.println("This is a colored line. " +
                "Coordinates of the first point: " + getCoordinates1().getX() + ", " + getCoordinates1().getY() +
                ". Coordinates of the second point: " + getCoordinates2().getX() + ", " + getCoordinates1().getY());
    }
}
