package com.softserve.edu08.pt;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("SoftServe Academy", new Department.Address("Lviv", "Naukova", 121));
        Department departmentClone = (Department) department.clone();

        System.out.println(department);
        System.out.println(departmentClone);

        departmentClone.getAddress().setCity("Kyiv");

        System.out.println(department);
        System.out.println(departmentClone);

    }
}
