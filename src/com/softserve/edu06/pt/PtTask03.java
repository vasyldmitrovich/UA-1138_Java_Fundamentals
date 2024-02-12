package com.softserve.edu06.pt;

public class PtTask03 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(3, 4), new Point(8, 9)),
                new ColorLine(new Point(12, 15), new Point(28, 33), "Red"),
        };
        for (var line : lines) {
            line.print();
        }
    }
}
