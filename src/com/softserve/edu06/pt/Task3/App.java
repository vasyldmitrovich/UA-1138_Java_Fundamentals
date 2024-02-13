package com.softserve.edu06.pt.Task3;

public class App {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1,2), new Point(3,4)),
                new ColorLine(new Point(5,6), new Point(7,8), "white")
        };

        for (Line line : lines) {
            line.print();
        }


    }
}
