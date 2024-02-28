package com.softserve.edu08;

public class Student extends Person implements Cloneable {
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
    public String activity() {
        return "I study at University";
    }

    @Override
    public String info() {
        return "First name: " + getFullName().getFirstName()
                + ", Last name: " + getFullName().getLastName()
                + ", Age: " + getAge()
                + ", Course: " + getCourse();
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
