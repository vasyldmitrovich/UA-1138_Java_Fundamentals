package com.softserve.edu04.hw.Task4;

import java.util.Scanner;

import static java.lang.System.in;

public class Faculty {
    private int numberOfStudents;
    private CurrentSeason currentSeason;

    public Faculty (int numberOfStudents, CurrentSeason currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }
}
