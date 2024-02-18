package com.softserve.edu08.pt;

public class PrTask1 {
    public static void main(String[] args) {
        Department departmentOriginal = new Department(
                "Softserve",
                new Department.Address("Lviv", "Naukova", 120)
        );
        System.out.println(departmentOriginal);

        Department departmentClone = departmentOriginal.clone();
        departmentClone.getAddress().setCity("Kyiv");
        System.out.println("After cloning: ");
        System.out.println(departmentOriginal);
        System.out.println(departmentClone);


    }
}
