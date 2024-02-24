package com.softserve.edu07;

import java.util.Arrays;

public class HW7_01 {
    public static void main(String[] args) {
        Employee[] workers = new Employee[4];
        workers[0] = new SalariedEmployee("12", "Patrick", 100.00, 12345);
        workers[1] = new SalariedEmployee("13", "Keanu", 120, 23456);
        workers[2] = new ContractEmployee("14", "Erika", 8, 5, 34567);
        workers[3] = new ContractEmployee("15", "Marla", 10.00, 7, 45678);

        Arrays.sort(workers);

        for (Employee worker : workers) {
            System.out.println(worker.toString());
        }
    }


}

