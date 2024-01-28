package com.softserve.edu03.pt;

public class PT2 {
    public static void main(String... args) {
        Employee employee1 = new Employee();
        employee1.setName("A");
        employee1.setRate(10);
        employee1.setHours(1);

        Employee employee2 = new Employee("B", 5);
        employee2.setHours(2);

        Employee employee3 = new Employee("C", 10, 2);

        System.out.println("Employee 1 " + employee1);
        System.out.println("Employee 2 " + employee2);
        System.out.println("Employee 3 " + employee3);

        System.out.println(Employee.getTotalSum());
    }

    static class Employee {
        private static final double BONUS_RATE = 0.1; //10% from salary
        private static double totalSum;
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

        public static double getTotalSum() {
            return (1 + BONUS_RATE) * totalSum;
        }

        public static void setTotalSum(double totalSum) {
            Employee.totalSum = totalSum;
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
            totalSum -= oldSalary;
            totalSum += newSalary;

        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            double oldSalary = getSalary();
            this.hours = hours;
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
}