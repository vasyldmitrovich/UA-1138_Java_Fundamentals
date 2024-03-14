package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public void promote() {
        if (calculateAverageGrade() >= 3) {
            course++;
        }
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public class Main {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();

            students.add(new Student("Luke", "Group A", 1, List.of(80, 75, 95)));
            students.add(new Student("Lisa", "Group B", 2, List.of(60, 70, 90)));
            students.add(new Student("Mike", "Group A", 1, List.of(55, 72, 80)));

            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = null;
                if (student.calculateAverageGrade() < 3) {
                    iterator.remove();
                } else {
                    student.promote();
                }
            }
            printStudents(students, 1);
        }

        public static void printStudents(List<Student> students, int course) {
            System.out.println("Students enrolled in course " + course + ":");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
}
