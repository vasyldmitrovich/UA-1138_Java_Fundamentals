package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable {
    int course;

    Student(int course, FullName fullName, int age) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String info() {
        return "My course " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public void setCourse(int course) {
        this.course = course + 1;
    }
}
