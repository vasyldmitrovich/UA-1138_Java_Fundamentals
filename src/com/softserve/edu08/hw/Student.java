package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable {//Do not correct order of methods see code convention
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
    protected Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public String info() {
        return getFullName() + ", Age: " + getAge() + ", Course: " + getCourse();
    }
}
