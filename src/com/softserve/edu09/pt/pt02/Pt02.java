package com.softserve.edu09.pt.pt02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pt02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String line = scan.nextLine();
        String[] tokens = line.split(", ");
        for (var token : tokens){
            int num = Integer.parseInt(token);
            if (!numbers.contains(num)){
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }
}
