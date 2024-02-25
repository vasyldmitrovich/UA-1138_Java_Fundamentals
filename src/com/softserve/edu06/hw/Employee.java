package com.softserve.edu06.hw;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String position;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: \u2084 %.2f.", name, age, salary, position);
    }

    public static class Developer extends Employee {
        String position = "Java developer";
        double salary = 32735.35;
        private String employeeInfo;

        public Developer(String name, int age, double salary, String position) {
            super(name, age, salary);
            this.employeeInfo = employeeInfo;
            this.position = position;
        }

        public String getEmployeeInfo() {
            return employeeInfo;
        }

        public void setEmployeeInfo(String employeeInfo) {
            this.employeeInfo = employeeInfo;
        }

        public String report() {
            return getEmployeeInfo();
        }

        public static void main(String[] args) {
            Employee employee = new Employee("Liza", 30, 35000.0);
            Developer developer = new Developer("Taras", 32, 32735.35, "Java developer");

            System.out.println("Employee Information: ");
            System.out.println(employee.report());

            System.out.println("Developer Information: ");
            System.out.println(developer.report());
        }
    }
}
