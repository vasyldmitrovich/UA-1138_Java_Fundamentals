package com.softserve.edu06.pt.Task3;

public class Line {//Good
    private Point point1;
    private Point point2;


    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public void print() {
        System.out.println("This is a " + "line" +
                " with properties: " +
                "first point: " + this.getPoint1().getX() + " " + this.getPoint1().getY() +
                ", second point: " + this.getPoint2().getX() + " " + this.getPoint2().getY()
        );
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}
