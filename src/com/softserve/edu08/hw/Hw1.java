package com.softserve.edu08.hw;

public class Hw1 {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Jack", "Wills");
        Student student1 = new Student(fullName1, 20, 3);
        Student student2 = new Student(new FullName("Bob", "Smith"), 22, 2);

        Student student3 = student1.clone();
        student3.setCourse(4);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}

class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }
}

abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", " +
                "Last name: " + fullName.getLastName() + ", " +
                "Age: " + age;
    }

    public abstract String activity();
}


