package com.softserve.edu08.hw;

class Student extends Person {
    public int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public String info() {
        return super.info() + ", Course: " + course;
    }

    public String activity() {
        return " I study at IT Academy";
    }

    public Object clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new FullName("Mike", "Cleman"), 27, 1);
        Student student2 = new Student(new FullName("Lisa", "Bloom"), 22, 2);

        System.out.println("Student 1: ");
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println("Student 2: ");
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = (Student) student1.clone();
        student3.course = 3;

        System.out.println("\nCloned Student: ");
        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
