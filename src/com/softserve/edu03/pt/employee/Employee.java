package com.softserve.edu03.pt.employee;

import static com.softserve.edu03.pt.employee.Main.SCANNER;

public class Employee {
    private static final double BONUSES = 0.1;//Why public???
    private static double totalSum;

    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return getSalary() * BONUSES;
    }

    public static double getTotalSum() {
        return BONUSES * totalSum + totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public static void printEmployeeStats() {
        System.out.println("Total sum: %.2f".formatted(Employee.getTotalSum()));
    }

    public static void promptParameters(Employee employee) {//Good
        System.out.print("Input name:");
        String name = SCANNER.nextLine();
        employee.setName(name);
        System.out.println("Input rating for employee '" + employee.getName() + "':");
        double rating = SCANNER.nextDouble();
        employee.setRate(rating);
        System.out.println("Input hours of work: ");
        int hour = SCANNER.nextInt();
        SCANNER.nextLine();
        employee.setHours(hour);
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name +
                '\'' + ", rate=" + rate +
                ", hours=" + hours + ", salary=" + getSalary() +
                ", bonuses=" + getBonuses() + '}';
    }
}
