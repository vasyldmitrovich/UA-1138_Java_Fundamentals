package com.softserve.edu09.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(15, "books"));
        boxes.add(new HeavyBox(8, "toys"));
        boxes.add(new HeavyBox(20, "electronics"));

        System.out.println("Initial contents of boxes:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        if (!boxes.isEmpty()) {
            boxes.get(0).setWeight(16);
        }

        System.out.println("*".repeat(40));
        System.out.println("Boxes after weight change:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        System.out.println("*".repeat(40));
        boxes.clear();
        System.out.println("Empty boxes list:");
        System.out.println(boxes);
    }
}
