package com.softserve.edu08.hw.HW01;

public class main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John ", "Dow ");
        Person person = new Person(18, fullName);
        System.out.println(person.info() + person.activity());


        Student student = new Student(18, new FullName("Alice ", "Smith "), 2);
        System.out.println(student.info() + student.activity());
    }
}
