package com.softserve.edu08.pt.Task1;

public class Main {
    public static void main(String[] args) {
        Department departmentOriginal = new Department(
                "Softserve",
                new Address("Lviv", "Naukova", 120)
        );
        System.out.println("Original Department:");
        System.out.println(departmentOriginal);

        Department departmentClone = departmentOriginal.clone();
        departmentClone.getAddress().setCity("Kyiv");

        System.out.println("\nAfter cloning:");
        System.out.println("Original Department:");
        System.out.println(departmentOriginal);
        System.out.println("Cloned Department:");
        System.out.println(departmentClone);
    }
}