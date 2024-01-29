package com.softserve.edu03.pt;

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Thaddeus");
        employee1.setRate(18.5);
        employee1.setHours(6);
        Employee employee2 = new Employee("Justin", 11.5, 10);
        Employee employee3 = new Employee("Kate", 10, 12);

        System.out.println("Empl1: " + employee1);
        System.out.println("Empl2: " + employee2);
        System.out.println("Empl3: " + employee3);
        System.out.println(Employee.getTotalSum());

    }
}

class Employee {
    public static final double BONUS_RATE = 0.1;
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {

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


    public Employee(String name, double rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    public static double getTotalSum() {
        return BONUS_RATE * totalSum + totalSum;
    }


    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum -= oldSalary;
        totalSum += newSalary;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
        double newSalary = getSalary();
        totalSum -= oldSalary;
        totalSum += newSalary;
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