package com.softserve.edu6.pt.task3;

public class Main {
    public static void main(String[] args) {
        Line line[] = {
                new Line(new Point(10, 15), new Point(8, 9)),
                new ColorLine(new Point(6, 9), new Point(4, 7), "green"),
        };
        for (int i = 0; i < line.length; i++) {
            line[i].print();
        }
    }
}
