package com.softserve.edu08;

public class HW8 {
    public static void main(String[] args) {
        FullName fullName1 = new FullName();
        fullName1.setFirstName("Alex");
        fullName1.setLastName("Knoll");
        Student student1 = new Student(fullName1, 21, 2);

        FullName fullName2 = new FullName();
        fullName2.setFirstName("Maria");
        fullName2.setLastName("Lesko");
        Student student2 = new Student(fullName2, 24, 3);

        Student student3 = student1.clone();
        student3.setCourse(5);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
