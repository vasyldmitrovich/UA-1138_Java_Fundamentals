package com.softserve.edu8.pt.hw.Task1_2;

public class Student extends Person implements Cloneable{//Ok
    private int amountOfCourses;

    public Student(FullName fullName, int age, int amountOfCourses) {
        super(fullName, age);
        this.amountOfCourses = amountOfCourses;
    }

    public int getAmountOfCourses() {
        return amountOfCourses;
    }

    public void setAmountOfCourses(int amountOfCourses) {
        this.amountOfCourses = amountOfCourses;
    }

    @Override
    public String info() {
        return super.info() + ", Amount the courses the student is taking, " + amountOfCourses;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone(){
        try {
            Student copyOfStudent = (Student) super.clone();
            FullName copyOfFullName = copyOfStudent.getFullName().clone();
            copyOfStudent.setFullName(copyOfFullName);
            return copyOfStudent;
        } catch (CloneNotSupportedException e)  {
            return null;
        }

    }
}
