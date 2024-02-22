package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;

public class Pt03 {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        int[] array = randomNum();

        System.out.println(Arrays.toString(array));
        System.out.println("The max values: " + arrayMax(array) );
        System.out.println("The sum values: " + sum(array) );
        System.out.println("Count the number of negative number: " + countNegatives(array));
        System.out.println("Count the number of positive number: " + countPositive(array));
        moreNegativeOrPositive(array);
    }

    public static int[] randomNum(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(-1000, 1000);
        }
        return array;
    }

    public static int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static long sum(int[] array){
        int sum = 0;
        for (int i : array){
            if(i > 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int countNegatives(int[] array){
        int count = 0;
        for (int i : array){
            if(i < 0 ){
                count++;
            }
        }
        return count;
    }
    public static int countPositive(int[] array){
        int count = 0;
        for (int i : array){
            if(i > 0 ){
                count++;
            }
        }
        return count;
    }
    public static void moreNegativeOrPositive(int[] array){
        if(countPositive(array) == countNegatives(array)){
            System.out.println("There are an equal number of positive and negative values in the array.");
        } else if (countPositive(array) < countNegatives(array)){
            System.out.println("There are more negative values in the array.");
        }else {
            System.out.println("There are more positive values in the array.");
        }
    }
}
