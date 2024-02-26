package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeTask02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, 2, "Bob", 4, 3, 3));
        students.add(new Student(1, 11, "Jake", 1, 5, 2));
        students.add(new Student(2, 6, "Martin", 5, 4, 4));
        students.add(new Student(4, 8, "Sally", 4, 2, 2));

        System.out.println("Original list of students: " + students);

        List<Student> studentsWithoutStudentsWithGradeLessThan3 = removeStudentsWithGradeLessThan3(students);
        System.out.println("\nList of student with average grade bigger than 3: " + studentsWithoutStudentsWithGradeLessThan3);

        printStudents(students, 4);


    }

    public static List<Student> removeStudentsWithGradeLessThan3(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            int averageRate = (student.getGradeMath() + student.getGradeEnglish() + student.getGradePhysics()) / 3;
            if (averageRate < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
        return list;
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nStudents enrolled in course " + course + ":");

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
