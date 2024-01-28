package com.softserve.edu03.pt;

public class PrTask2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("Bob");
        employee1.setHours(3);
        employee1.setRate(100);

        Employee employee2 = new Employee("Alice", 100);
        employee2.setHours(5);

        Employee employee3 = new Employee("John", 100, 4);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        System.out.println("Total Sum: " + Employee.getTotalSum());

    }
}

class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSum = 0.0;

    private static final double BONUS_RATE = 0.1;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
    }

    //public String getName() {
    //   return name;
    //}

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return getHours() * getRate();
    }

    public double getBonuses() {
        return getSalary() * BONUS_RATE;
    }

    public static double getTotalSum() {
        return totalSum + BONUS_RATE * totalSum;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
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
}
