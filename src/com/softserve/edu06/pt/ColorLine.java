package com.softserve.edu06.pt;

class ColorLine extends Line {
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        String base = super.toString();
        return "Color" + base.substring(0, base.length() - 1) +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void print() {
        super.print();
    }
}
