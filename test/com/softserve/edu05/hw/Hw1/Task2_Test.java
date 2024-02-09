package com.softserve.edu05.hw.Hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2_Test {

    @Test
    void calculateArray() {
        Assertions.assertAll(
                () -> assertEquals(15,   Task2.calculateArray(new int[]{1,2,3,4,5,6,7,8,9,10})),
                () -> assertEquals(120,  Task2.calculateArray(new int[]{-1,2,3,4,5,1,2,3,4,5})),
                () -> assertEquals(19,   Task2.calculateArray(new int[]{5,2,3,4,5,6,7,8,9,10})),
                () -> assertEquals(-120, Task2.calculateArray(new int[]{1,2,3,4,-5,-1,2,3,4,5}))
        );
    }
}
