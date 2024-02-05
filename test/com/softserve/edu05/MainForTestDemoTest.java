package com.softserve.edu05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainForTestDemoTest {
    @Test
    @DisplayName("sorting empty array")
    void sortEmpty() {
        // arrange  given
        int[] arr = {};
        // act      when
        MainForTestDemo.sort(arr);
        // assert   then
        assertTrue(true);
    }

    @Test
    @DisplayName("sorting 3 element array")
    void sort2() {
        // arrange  given
        int[] arr = {3, 2, 1};
        int[] expected = {1, 2, 3};
        // act      when
        MainForTestDemo.sort(arr);
        // assert   then
        assertArrayEquals(expected, arr);
    }

    //    @Test
    @RepeatedTest(10)
    @DisplayName("sorting random arrays")
    void sort3() {
        // arrange  given
        int[] arr = new Random()
                .ints(10, -100, 100)
                .toArray();
//        System.out.println(Arrays.toString(arr));
        // act      when
        MainForTestDemo.sort(arr);
        // assert   then
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
//        System.out.println(Arrays.toString(arr));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 8})
    void isEven_returns_true_provided_even_number(int i) {
        assertTrue(MainForTestDemo.isEven(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7})
    void isEven_returns_false_provided_odd_number(int i) {
        assertFalse(MainForTestDemo.isEven(i));
    }
}