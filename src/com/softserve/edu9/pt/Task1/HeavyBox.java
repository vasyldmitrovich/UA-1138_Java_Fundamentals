package com.softserve.edu9.pt.Task1;

public class HeavyBox {//Good
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
