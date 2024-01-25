package com.softserve.edu01.hw;

public class Task2
{
    public static void main(String[] args) {
        int result  = sum(new int[]{2, 4, 12, 45, 13, 16});
        System.out.println(result);
    }
    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length <= 1){
            return 0;
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int num: numbers){
            if (max < num){
                max = num;
            }
            if (min > num){
                min = num;
            }
        }
        int sum = 0;
        for (int num: numbers){
            sum += num;
        }

        return sum-min-max;
    }
}
/*
Task:
Sum all the numbers of a given array , except the highest and the lowest element ( by value, not by index).
 */
