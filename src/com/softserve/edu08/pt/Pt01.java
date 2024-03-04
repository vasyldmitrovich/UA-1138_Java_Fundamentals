package com.softserve.edu08.pt;

public class Pt01 {
    public static void main(String[] args) {

        Department departmentOriginal = new Department("SoftServe Academy",
                new Department.Address("Lviv", "Naukova", "156"));

        Department departmentClone = departmentOriginal.clone();

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);

        System.out.println("Changing city");
        departmentClone.getAddress().setCity("Kyiv");

        System.out.println(departmentOriginal);
        System.out.println(departmentClone);
    }
}
