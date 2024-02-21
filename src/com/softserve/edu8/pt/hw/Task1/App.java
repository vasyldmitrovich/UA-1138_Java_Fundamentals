package com.softserve.edu8.pt.hw.Task1;

public class App {
    public static void main(String[] args) {
        Student student = new Student(new FullName("Vitalii", "Kravtsov"), 29, 3);
        Student student1 = new Student(new FullName("Petro", "Piatochkin"), 25, 4);

        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println(student1.info());
        System.out.println(student1.activity());

        Student student2 = student.clone();

        student2.setAmountOfCourses(1);
        student2.getFullName().setFirstName("Kolia");

        System.out.println(student.info());
        System.out.println(student.activity());
        System.out.println("_______________");
        System.out.println(student2.info());
        System.out.println(student2.activity());
    }
}
