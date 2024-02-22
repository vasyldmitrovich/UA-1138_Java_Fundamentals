package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.List;

public class PrTask01 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "Cups"));
        boxes.add(new HeavyBox(60, "Tables"));
        boxes.add(new HeavyBox(15, "Knifes"));

        System.out.println(boxes);

        boxes.get(0).setWeight(10);
        System.out.println("\n" + boxes.get(0) + "\n");

        boxes.removeLast();
        System.out.println(boxes + "\n");

        boxes.clear();
        System.out.println(boxes);
    }
}
