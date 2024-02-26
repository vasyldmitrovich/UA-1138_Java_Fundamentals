package com.softserve.edu9.hw.Task2;

public class App {
    public static void main(String[] args) {
        // Create student collection
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("Vitalii", 1, 1, new int[]{1, 2, 3});
        studentManager.addStudent("Petro", 2, 3, new int[]{1, 2, 3});
        studentManager.addStudent("Andrii", 5, 1, new int[]{5, 5, 5});
        studentManager.addStudent("Alex", 7, 9, new int[]{4, 5, 4});
        studentManager.addStudent("Max", 10, 1, new int[]{5, 4, 4});

        // Remove students if avg score less 3 or promote them to the next course
        studentManager.examineStudents();

        //print out the names of the students who are enrolled in the specified course number
        studentManager.printStudents(studentManager.getStudents(), 2);

    }
}
