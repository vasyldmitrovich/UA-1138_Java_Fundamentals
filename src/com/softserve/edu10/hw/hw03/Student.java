package com.softserve.edu10.hw.hw03;

import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, int courseNum){
        Iterator<Student> iterator = students.iterator();
        System.out.println("Students in a course " + courseNum + " course:");
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getCourse() == courseNum){
                System.out.println(student.getName());
            }
        }

    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    public int sortCourse(Student o) {
        return Integer.compare(this.course, o.getCourse());
    }
}
