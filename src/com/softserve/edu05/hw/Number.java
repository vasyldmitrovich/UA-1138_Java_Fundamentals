package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.lang.System.in;

class Number {
    private int number;

    public Number() {
    }

    public int getNumber() {
        return number;
    }

    public void input() {
        Scanner scan = new Scanner(in);
        this.number = scan.nextInt();
    }
}
