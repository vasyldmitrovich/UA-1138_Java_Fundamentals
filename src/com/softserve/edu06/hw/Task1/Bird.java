package com.softserve.edu06.hw.Task1;

public abstract class Bird {
    protected boolean feathers;//Make private
    protected boolean layEggs;

    protected String name;

    abstract String fly();//This methods after getters and setters

    public void printInformation() {
        System.out.println(
                            "I`m a " + this.getName() + ". I " +
                            (this.isFeathers() ? "have " : "don`t have ") + "feathers, " +
                            "I " +
                            (this.isLayEggs() ? "lay " : "don`t lay ") + "eggs " +
                            "and " + this.fly()
                            );
    }

    public boolean isFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
