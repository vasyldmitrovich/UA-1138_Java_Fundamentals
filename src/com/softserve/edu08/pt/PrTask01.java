package com.softserve.edu08.pt;

public class PrTask01 {
    public static void main(String[] args) {
        Department departmentOriginal = new Department("SoftServe Academy", new Department.Address("Kyiv", "Khreshchatyk", 25));
        Department departmentClone = departmentOriginal.clone();

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);

        departmentClone.getAddress().setCity("Lviv");

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);
    }
}
