package com.softserve.edu05.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Hw1Test {

    @Test
    void getNumberOfDaysInMonth() {
        Assertions.assertAll(() -> assertEquals(31, Hw1.getNumberOfDaysInMonth(1)),
                () -> assertEquals(29, Hw1.getNumberOfDaysInMonth(2)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(3)),
                () -> assertEquals(30, Hw1.getNumberOfDaysInMonth(4)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(5)),
                () -> assertEquals(30, Hw1.getNumberOfDaysInMonth(6)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(7)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(8)),
                () -> assertEquals(30, Hw1.getNumberOfDaysInMonth(9)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(10)),
                () -> assertEquals(30, Hw1.getNumberOfDaysInMonth(11)),
                () -> assertEquals(31, Hw1.getNumberOfDaysInMonth(12)),
                () -> assertEquals(0,  Hw1.getNumberOfDaysInMonth(13))
        );
    }

    @Test
    void calculateArray() {
        Assertions.assertAll(
                () -> assertEquals(15,   Hw1.calculateArray(new int[]{1,2,3,4,5,6,7,8,9,10})),
                () -> assertEquals(120,  Hw1.calculateArray(new int[]{-1,2,3,4,5,1,2,3,4,5})),
                () -> assertEquals(19,   Hw1.calculateArray(new int[]{5,2,3,4,5,6,7,8,9,10})),
                () -> assertEquals(-120, Hw1.calculateArray(new int[]{1,2,3,4,-5,-1,2,3,4,5}))
        );
    }

    @Test
    void getSecondPositiveNumberPosition() {
        Assertions.assertAll(
                () -> assertEquals(1, Hw1.getSecondPositiveNumberPosition(new int[]{1,2,3,4,5})),
                () -> assertEquals(2, Hw1.getSecondPositiveNumberPosition(new int[]{-1,2,3,4,})),
                () -> assertEquals(1, Hw1.getSecondPositiveNumberPosition(new int[]{5,2,3,4,5})),
                () -> assertEquals(0, Hw1.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,-4,5})),
                () -> assertEquals(4, Hw1.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,4,5})),
                () -> assertEquals(0, Hw1.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,-4,-5}))
        );
    }

    @Test
    void getMinValueAndPosition() {
        Assertions.assertAll(
                () -> assertArrayEquals(new int []{1,0}, Hw1.getMinValueAndPosition(new int[]{1,2,3,4,5})),
                () -> assertArrayEquals(new int []{-5,4}, Hw1.getMinValueAndPosition(new int[]{1,2,3,4,-5})),
                () -> assertArrayEquals(new int []{-4,3}, Hw1.getMinValueAndPosition(new int[]{-1,-2,-3,-4,5})),
                () -> assertArrayEquals(new int []{-3,2}, Hw1.getMinValueAndPosition(new int[]{-1,-2,-3,-3,5}))
        );
    }

    @Test
    void getProductOfEvenNumbers() {
        Assertions.assertAll(
                () -> assertEquals(8, Hw1.getProductOfEvenNumbers(new int[]{1,2,3,4,5})),
                () -> assertEquals(64, Hw1.getProductOfEvenNumbers(new int[]{1,2,3,4,-5, 8})),
                () -> assertEquals(-8, Hw1.getProductOfEvenNumbers(new int[]{-1,-2,-3,-4,5})),
                () -> assertEquals(-20, Hw1.getProductOfEvenNumbers(new int[]{-1,-2,-3,-3,5,-10}))
        );
    }
}