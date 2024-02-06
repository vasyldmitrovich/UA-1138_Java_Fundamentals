package com.softserve.edu03.pt;

public class PrTask02 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Alice");
        employee1.setRate(10);
        employee1.setHours(10);

        Employee employee2 = new Employee("Bob", 10);
        employee2.setHours(10);

        Employee employee3 = new Employee("Jack", 10, 10);

        System.out.println("Empl1 = " + employee1);
        System.out.println("Empl2 = " + employee2);
        System.out.println("Empl3 = " + employee3);

        System.out.println(Employee.getTotalSum());
    }
}

class Employee {//Move to file Employee.java
    private static final double BONUS_RATE = 0.1;
    private static double totalSum = 0.0;//this variable will have this data by default
    private String name;
    private double rate;
    private int hours;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public double getSalary() {
        return getRate() * getHours();
    }

    public double getBonuses() {
        return BONUS_RATE * getSalary();
    }

    public static double getTotalSum() {
        return (1 + BONUS_RATE) * totalSum;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonuses= " + getBonuses() +
                '}';
    }
}