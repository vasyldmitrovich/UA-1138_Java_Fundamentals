package com.softserve.edu06.pt;

public class Pt2 {
    public static void main(String[] args) {//Ok
        Line[] lines = {
                new Line(new Point(2, 2), new Point(4, 6)),
                new ColorLine(new Point(1, 3), new Point(3, 7), "Red"),
                new ColorLine(new Point(5, 9), new Point(5, 5), "Blue")
        };

        for (Line line : lines) {
            line.print();
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void print() {
        System.out.println(toString());
    }//Not need toString
}

class Line {
    private Point x;
    private Point y;

    public Line(Point start, Point end) {
        this.x = start;
        this.y = end;
    }

    @Override
    public String toString() {
        return "Line from " + x + " to " + y;
    }

    public void print() {
        System.out.println(toString());
    }//The same
}

class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " with color " + color;
    }

    public void print() {
        System.out.println(toString());
    }//The same
}




