package com.softserve.edu04.hw;

enum Season {//Move to file Season.java
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private final String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getName() {
        return seasonName;
    }
}
