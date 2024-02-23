package com.softserve.edu06.pt.pt03;

public class Pt03 {//Veri nice
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(1, 5), new Point(2, 4)),
                new ColorLine(new Point(7, 2), new Point(3, 2), "Blue"),
        };
        for (var line : lines) {
            line.print();
        }
    }

}
