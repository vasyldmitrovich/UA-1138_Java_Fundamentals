package com.softserve.edu05.hw.Hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3_Test {
    @Test
    void getSecondPositiveNumberPosition() {
        Assertions.assertAll(
                () -> assertEquals(1, Task3.getSecondPositiveNumberPosition(new int[]{1,2,3,4,5})),
                () -> assertEquals(2, Task3.getSecondPositiveNumberPosition(new int[]{-1,2,3,4,})),
                () -> assertEquals(1, Task3.getSecondPositiveNumberPosition(new int[]{5,2,3,4,5})),
                () -> assertEquals(0, Task3.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,-4,5})),
                () -> assertEquals(4, Task3.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,4,5})),
                () -> assertEquals(0, Task3.getSecondPositiveNumberPosition(new int[]{-1,-2,-3,-4,-5}))
        );
    }

    @Test
    void getMinValueAndPosition() {
        Assertions.assertAll(
                () -> assertArrayEquals(new int []{1,0}, Task3.getMinValueAndPosition(new int[]{1,2,3,4,5})),
                () -> assertArrayEquals(new int []{-5,4}, Task3.getMinValueAndPosition(new int[]{1,2,3,4,-5})),
                () -> assertArrayEquals(new int []{-4,3}, Task3.getMinValueAndPosition(new int[]{-1,-2,-3,-4,5})),
                () -> assertArrayEquals(new int []{-3,2}, Task3.getMinValueAndPosition(new int[]{-1,-2,-3,-3,5}))
        );
    }

    @Test
    void getProductOfEvenNumbers() {
        Assertions.assertAll(
                () -> assertEquals(8, Task3.getProductOfEvenNumbers(new int[]{1,2,3,4,5})),
                () -> assertEquals(64, Task3.getProductOfEvenNumbers(new int[]{1,2,3,4,-5, 8})),
                () -> assertEquals(-8, Task3.getProductOfEvenNumbers(new int[]{-1,-2,-3,-4,5})),
                () -> assertEquals(-20, Task3.getProductOfEvenNumbers(new int[]{-1,-2,-3,-3,5,-10}))
        );
    }
}
