package com.softserve.edu06.pt.Task3;

class ColorLine extends Line {
    private String color;

    public ColorLine(Point startPoint, Point endPoint, String color) {
        super(startPoint, endPoint);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " (Color: " + color + ")";
    }

    public void print() {
        System.out.println(toString());
    }
}
