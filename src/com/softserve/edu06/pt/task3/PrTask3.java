package com.softserve.edu06.pt.task3;

public class PrTask3 {//Ok
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(new Point(11, 22), new Point(33, 44), "Red")

        };
        for (var line : lines) {
            line.print();
        }
    }
}





