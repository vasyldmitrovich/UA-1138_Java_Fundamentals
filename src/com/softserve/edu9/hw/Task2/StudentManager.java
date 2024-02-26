package com.softserve.edu9.hw.Task2;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students = new ArrayList<>();

    public StudentManager() {
    }

    public StudentManager(List<Student> students) {
        this.students = students;
    }

    public void addStudent (String name, int group, int course, int[] grades) {
        students.add(new Student(name, group, course, grades));
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public void examineStudents() {
        List<Student> students1 = new ArrayList<>();
        for(Student student : students) {
            if(student.getAverageGrade() > 3) {
                student.setCourse(student.getCourse()+1);
                students1.add(student);
            }
        }
        this.setStudents(students1);
    }

    public void printStudents(List<Student> students, int course) {
        System.out.println("Students who study course " + course + ": ");
        for (Student student : students) {
            if(student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
