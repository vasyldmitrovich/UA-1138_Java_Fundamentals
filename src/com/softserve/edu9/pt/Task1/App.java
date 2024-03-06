package com.softserve.edu9.pt.Task1;

import java.util.ArrayList;
import java.util.List;

public class App {//Good
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(3, "plates"));
        boxes.add(new HeavyBox(6, "knifes"));

        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.get(0).setWeight(1);
        boxes.removeLast();
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.clear();
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }
    }
}
