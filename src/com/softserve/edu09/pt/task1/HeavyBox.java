package com.softserve.edu09.pt.task1;

public class HeavyBox {
    private int weigth;//Maybe weight not weigth
    private String content;

    public HeavyBox(int weigth, String content) {
        this.weigth = weigth;
        this.content = content;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weigth=" + weigth +
                ", content='" + content + '\'' +
                '}';
    }
}
