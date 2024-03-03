package com.softserve.edu06.pt.Task3;

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line from " + startPoint + " to " + endPoint;
    }

    public void print() {
        System.out.println(toString());
    }
}