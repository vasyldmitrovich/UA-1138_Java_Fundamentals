package com.softserve.edu09.hw;

import java.util.Iterator;
import java.util.List;

public class LowPerformingStudents {

    public static void removeLowPerformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateAverage() < 3.0) {
                iterator.remove();
            } else {

                if (student.getCourse() < 5) {
                    student.course++;
                }
            }
        }

    }
}
