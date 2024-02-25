package com.softserve.edu9.hw.Task2;

public class App {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent("Vitalii", 1, 1, new int[]{1, 2, 3});
        studentManager.addStudent("Petro", 1, 1, new int[]{1, 2, 3});
        studentManager.addStudent("Andrii", 1, 1, new int[]{5, 5, 5});
        studentManager.addStudent("Alex", 1, 1, new int[]{4, 4, 4});

        studentManager.examineStudents();

        studentManager.printStudents(studentManager.getStudents(), 2);

    }
}
