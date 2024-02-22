package com.softserve.edu05.pt.pt04;

import static com.softserve.edu05.pt.pt04.Pt04.SCANNER;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void input(Employee employee) {
        System.out.println("Input name: ");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.println("Input department number: ");
        int numberDepartment = SCANNER.nextInt();
        employee.setDepartmentNumber(numberDepartment);
        System.out.println("Input salary: ");
        int salary = SCANNER.nextInt();
        employee.setSalary(salary);
        SCANNER.nextLine();
    }
}
