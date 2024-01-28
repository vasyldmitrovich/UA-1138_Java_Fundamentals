package com.softserve.edu03.pt;

public class PrTask02 {
    public static void main(String[] args) {
    Employee employee1 = new Employee();
    employee1.setName("Bob");
    employee1.setRate(10.5);
    employee1.setHours(10);

    Employee employee2 = new Employee("Rob", 8.0);
    employee2.setHours(2);

    Employee employee3 = new Employee("Jack", 12, 20);

    System.out.println("Empl1 = " + employee1);
    System.out.println("Empl2 = " + employee2);
    System.out.println("Empl3 = " + employee3);
    System.out.println(Employee.getTotalSum());

    }
}

class Employee {
    public static final double BONUS_RATE = 0.1; // 10% from salary
    private static double totalSum;
    private String name;
    private double rate;
    private int hours;

    public Employee(){

    }

    public double getSalary(){
        return getRate() * getHours();
    }
    public double getBonuses(){
        return BONUS_RATE * getSalary();
    }

    public Employee(String name, double rate){
        this.name = name;
        setRate(rate);
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        setRate(rate);
        setHours(hours);
    }
    public static double getTotalSum() {
        return BONUS_RATE * totalSum + totalSum;
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


    public void setHours(int hours) {
        double oldSalary = getSalary();
        this.hours = hours;
        double newSalary = getSalary();
        totalSum += newSalary - oldSalary;
    }

    public void setRate(double rate) {
        double oldSalary = getSalary();
        this.rate = rate;
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
                ", bonuses=" + getBonuses() +
                '}';
    }
}