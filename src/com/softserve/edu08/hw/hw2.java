package com.softserve.edu08.hw;

public class hw2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(1, new FullName("Bob", "Ford"), 18);
        Student student2 = (Student) student1.clone();

        student2.setCourse(1);

        System.out.print(student1.activity() + ". ");
        System.out.println(student1.info());
        System.out.print(student2.activity() + ". ");
        System.out.println(student2.info());

    }
}
