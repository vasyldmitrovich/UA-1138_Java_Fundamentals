package com.softserve.edu09.pt.pt01;

import java.util.ArrayList;
import java.util.List;

public class Pt01 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(9, "spoon"));
        boxes.add(new HeavyBox(3, "knife"));

        for (var item : boxes) {
            System.out.println(item);
        }

        boxes.get(0).setWeight(1);
        System.out.println("*".repeat(40));

        for (var item : boxes) {
            System.out.println(item);
        }
        System.out.println("*".repeat(40));
        boxes.removeLast();
        for (var item : boxes) {
            System.out.println(item);
        }
        System.out.println("*".repeat(40));
        boxes.clear();
        System.out.println(boxes);
    }
}
