package com.softserve.edu03.pt;

public class pt2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Mark");
        employee1.setRate(16.5);
        employee1.setHours(8);

        Employee employee2 = new Employee("Tom", 6);
        employee2.setHours(12);

        Employee employee3 = new Employee("Bob", 10.3, 7);

        System.out.println("Empl1: " + employee1);
        System.out.println("Empl2: " + employee2);
        System.out.println("Empl3: " + employee3);

        System.out.println(Employee.getTotalSum());
    }
}

class Employee {
    private static final double BONUS_RATE = 0.1;
    private String name;
    private double rate;
    private int hours;
    private static double totalSum = 0.0;

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

    public String getName() {
        return name;
    }

    public double getRate() {
        double oldSalary = totalSum;
        double newRate = rate;
        totalSum += getSalary() - oldSalary;
        return newRate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return (1 + BONUS_RATE) * totalSum;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
                ", bonuses=" + getBonuses() +
                '}';
    }
}
