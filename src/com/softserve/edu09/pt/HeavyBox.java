package com.softserve.edu09.pt;

import java.util.ArrayList;

class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        boxes.add(new HeavyBox(2, "Books"));
        boxes.add(new HeavyBox(5, "Notebook"));

        System.out.println("Initial contents: ");
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
        }
        if (!boxes.isEmpty()) {
            HeavyBox firstBox = boxes.get(0);
            firstBox.setWeight(firstBox.getWeight() + 1);
        }
        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }
        System.out.println("\nAfter modifications:");
        for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());

            System.out.println("\nAfter removing all boxes:");
            //for (HeavyBox box : boxes) {
            System.out.println("Weight: " + box.getWeight() + ", Contents: " + box.getContents());
            //}
        }
    }
}
