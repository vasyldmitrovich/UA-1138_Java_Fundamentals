package com.softserve.edu08.hw.hw01_02;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    String info() {
        return super.info() + ", Course: <" + getCourse() + '>';
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Student clone() {
        try {
            return  (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
