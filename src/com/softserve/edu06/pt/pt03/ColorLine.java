package com.softserve.edu06.pt.pt03;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String base = super.toString();
        return "ColorLine{" + base.substring(0, base.length() - 1) +
                "color='" + color + '\'' +
                '}';
    }

}
