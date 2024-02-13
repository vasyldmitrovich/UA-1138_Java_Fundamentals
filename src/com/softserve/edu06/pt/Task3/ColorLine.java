package com.softserve.edu06.pt.Task3;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point point1, Point point2) {
        super(point1, point2);
    }

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print() {
        System.out.println("This is a " + "coloured line" +
                        " with properties:" +
                        " first point: " + this.getPoint1().getX() + " " + this.getPoint1().getY() +
                        ", second point: " + this.getPoint2().getX() + " " + this.getPoint2().getY() +
                        ". Its color is " + this.getColor() + "."
        );
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
