package com.softserve.edu09.pt.Task1;

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