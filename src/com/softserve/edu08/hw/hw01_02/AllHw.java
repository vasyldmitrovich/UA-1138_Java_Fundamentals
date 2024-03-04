package com.softserve.edu08.hw.hw01_02;

public class AllHw {

    public static void main(String[] args) {
        FullName fullName1 = new FullName("Alina", "Komorova");
        FullName fullName2 = new FullName("Bob", "Scale");
        Person person = new Person(fullName1, 23) {
            @Override
            public String activity() {
                return "Play games";
            }
        };

        Student studentOriginal = new Student(fullName2, 19, 2);
        Student studentClone = studentOriginal.clone();
        System.out.println(person.info());
        System.out.println(person.activity());
        System.out.println("--------------------------");
        System.out.println(studentOriginal.info());
        System.out.println(studentOriginal.activity());
        System.out.println("--------------------------");
        System.out.println("Clone Student");
        studentClone.setCourse(3);
        System.out.println(studentClone.info());
        System.out.println(studentClone.activity());
    }
}
