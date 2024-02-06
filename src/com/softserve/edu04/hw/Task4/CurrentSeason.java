package com.softserve.edu04.hw.Task4;

public enum CurrentSeason {
    WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");
    private String seasonName;
    CurrentSeason(String seasonName) {
        this.seasonName = seasonName;
    }
    public void printGetSemester() {
        switch (this) {
            case AUTUMN -> System.out.println("First semester");
            case SPRING -> System.out.println("Second semester");
            case SUMMER -> System.out.println("Vacation");
            case WINTER -> System.out.println("Winter exam");
        }
    }
}
