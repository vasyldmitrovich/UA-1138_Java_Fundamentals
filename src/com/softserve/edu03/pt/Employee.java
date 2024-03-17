package com.softserve.edu03.pt;

import java.util.Scanner;

public class Employee {
    private static int totalSum;//You do not use this variable
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int rate;
    private int hours;

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();
        Employee employee2 = new Employee();
        employee2.input();
        Employee employee3 = new Employee();
        employee3.input();
    }

    public String toString() {

        return name;
    }

    public int getSalary() {
        return rate * hours;
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    public void input() {
        System.out.println("Input the name of the employee");
        name = scanner.nextLine();
        System.out.println("Input the employee rate");
        rate = scanner.nextInt();
        System.out.println("Input the employee's working hours");
        hours = scanner.nextInt();
        output();
    }

    public void output() {
        System.out.println("The employee's name is " + toString());//Without toString
        System.out.println("The employee's salary " + getSalary());
        System.out.println("The employee's bonuses " + getBonuses());
    }
}

