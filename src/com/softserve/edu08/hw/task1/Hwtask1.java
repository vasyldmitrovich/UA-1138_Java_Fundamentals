package com.softserve.edu08.hw.task1;

public class Hwtask1 {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Parker");
        Person person1 = new Person(fullName, 20) {
            @Override
            public String activity() {
                return "Work as Java-developer ";
            }
        };

        System.out.println(person1.info());
        System.out.println("Activity: " + person1.activity());
        System.out.println("===============================================");

        FullName studName = new FullName("Bob", "Ostin");
        Student student1 = new Student(studName, 19, 3);
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println("===============================================");
        System.out.println("After cloning: ");

        Student cloned = student1.clone();
        cloned.setTakedCourse(8);
        System.out.println(cloned.info());
        System.out.println(cloned.activity());
    }
}
