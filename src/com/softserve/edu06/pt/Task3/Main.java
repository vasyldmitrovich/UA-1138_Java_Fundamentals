package com.softserve.edu06.pt.Task3;

public class Main {//good
    public static void main(String[] args) {
        Line[] lines = new Line[3];
        lines[0] = new Line(new Point(0, 0), new Point(1, 1));
        lines[1] = new ColorLine(new Point(1, 2), new Point(3, 4), "Red");
        lines[2] = new ColorLine(new Point(2, 3), new Point(5, 6), "Blue");

        for (Line line : lines) {
            line.print();
        }
    }
}