package com.softserve.edu08.hw.task1;

public class Student extends Person implements Cloneable {
    private int takedCourse;

    public Student(FullName fullName, int age, int takedCourse) {
        super(fullName, age);
        this.takedCourse = takedCourse;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + takedCourse;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    public void setTakedCourse(int takedCourse) {
        this.takedCourse = takedCourse;
    }
}
