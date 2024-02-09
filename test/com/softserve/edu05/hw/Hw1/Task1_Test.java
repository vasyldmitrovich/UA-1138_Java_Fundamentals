package com.softserve.edu05.hw.Hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_Test {

    @Test
    void getNumberOfDaysInMonth() {
        Assertions.assertAll(() -> assertEquals(31, Task1.getNumberOfDaysInMonth(1)),
                () -> assertEquals(29, Task1.getNumberOfDaysInMonth(2)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(3)),
                () -> assertEquals(30, Task1.getNumberOfDaysInMonth(4)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(5)),
                () -> assertEquals(30, Task1.getNumberOfDaysInMonth(6)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(7)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(8)),
                () -> assertEquals(30, Task1.getNumberOfDaysInMonth(9)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(10)),
                () -> assertEquals(30, Task1.getNumberOfDaysInMonth(11)),
                () -> assertEquals(31, Task1.getNumberOfDaysInMonth(12)),
                () -> assertEquals(0,  Task1.getNumberOfDaysInMonth(13))
        );
    }


}