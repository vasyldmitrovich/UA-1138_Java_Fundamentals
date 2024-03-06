package com.softserve.edu09.pt.task1;

import java.util.ArrayList;
import java.util.List;

public class PrTask1 {//Good
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(5, "plates"));
        boxes.add(new HeavyBox(11, "knives"));
        for (var item : boxes) {
            System.out.println(item);
        }
        boxes.get(0).setWeigth(1);
        System.out.println("*".repeat(40));
        for (var item : boxes) {
            System.out.println(item);
        }
        System.out.println("*".repeat(40));
        boxes.clear();
        System.out.println(boxes);
    }
}
