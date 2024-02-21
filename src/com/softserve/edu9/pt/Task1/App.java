package com.softserve.edu9.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(3, "plates"));
        boxes.add(new HeavyBox(6, "knifes"));

        boxes.get(0).setWeight(1);

        boxes.clear();
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }
}
