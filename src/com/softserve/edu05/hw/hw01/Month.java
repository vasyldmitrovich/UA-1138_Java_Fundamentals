package com.softserve.edu05.hw.hw01;

public enum Month {//Nice
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private final String month;

    Month(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }


    public static Month monthOutput(int month){
        return switch (month){
            case 1 -> JANUARY;
            case 2 -> FEBRUARY;
            case 3 -> MARCH;
            case 4 -> APRIL;
            case 5 -> MAY;
            case 6 -> JUNE;
            case 7 -> JULY;
            case 8 -> AUGUST;
            case 9 -> SEPTEMBER;
            case 10 -> OCTOBER;
            case 11 -> NOVEMBER;
            case 12 -> DECEMBER;
            default -> throw new IllegalArgumentException("Enter num month from 1 to 12");
        };
    }
}
