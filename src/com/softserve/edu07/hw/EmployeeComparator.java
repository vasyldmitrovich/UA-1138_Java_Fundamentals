package com.softserve.edu07.hw;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Payment> {
    @Override
    public int compare(Payment employee1, Payment employee2) {
        double averageWage1 = employee1.calculatePay();
        double averageWage2 = employee2.calculatePay();

        return Double.compare(averageWage2, averageWage1);
    }
}
