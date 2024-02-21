package com.softserve.edu8.pt.Task1;

public class App {
    public static void main(String[] args) {
        Department department = new Department("Sales department", "Kyiv", "Kovpaka", 19);
        Department department2 = department.clone();

        System.out.println(department);
        System.out.println(department2);

        department.getAddress().setCity("Lviv");

        System.out.println(department);
        System.out.println(department2);
    }
}
