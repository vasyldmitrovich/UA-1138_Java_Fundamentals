package com.softserve.edu06.pt;

public class PT02 {
    public static void main(String... args) {
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(new Point(11, 22), new Point(33, 44), "Red")};

        for (var line : lines) {
            line.print();
        }
    }
}

class Point {//All classes should be in separate files
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public void print() {
        System.out.println(this);
    }
}

class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        String base = super.toString();
        return "Color{" + base.substring(0, base.length() - 1) +
                ", color='" + color + '\'' +
                '}';
    }

}
