package com.softserve.edu09;

import java.util.ArrayList;
import java.util.List;

public class PrTask9_01 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(12, "cups"));
        boxes.add(new HeavyBox(6, "plates"));
        boxes.add(new HeavyBox(10, "knives"));
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

class HeavyBox {
    private int weight;
    private String content;

    public HeavyBox(int weight, String content) {
        this.weight = weight;
        this.content = content;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", content='" + content + '\'' +
                '}';
    }
}
