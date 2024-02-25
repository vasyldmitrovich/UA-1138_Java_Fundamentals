package com.softserve.edu09.pt.PT01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Heavybox> boxes = new ArrayList<>();
        boxes.add(new Heavybox(12, "cups"));
        boxes.add(new Heavybox(6, "plates"));
        boxes.add(new Heavybox(10, "mugs"));
        for (var item : boxes) {
            System.out.println(item);
        }
        System.out.println("____");
        boxes.get(0).setWeight(1);
        for (var item : boxes) {
            System.out.println(item);
        }

        System.out.println("____");
        boxes.removeLast();
        for (var item : boxes) {
            System.out.println(item);
        }
        System.out.println("____");
        boxes.clear();
        System.out.println(boxes);

    }
}
