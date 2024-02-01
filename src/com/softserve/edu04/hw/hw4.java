package com.softserve.edu04.hw;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setErr;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the quantity of students at the faculty:");
        int quantity = scanner.nextInt();
        System.out.println("Enter the number of course:");
        int numOfCourse = scanner.nextInt();
        System.out.println("Enter the season:");
        scanner.nextLine();
        String season = scanner.nextLine().toUpperCase();
        Faculty faculty = new Faculty(quantity,numOfCourse);
        Season season1 = Season.valueOf(season);
        System.out.println(faculty);
        System.out.println(season1.CurrentSemester());

    }
}

class Faculty {
    private int quantityOfStudents;
    private int course;

    public Faculty(int quantityOfStudents, int course) {
        this.quantityOfStudents = quantityOfStudents;
        this.course = course;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Faculty {" +
                "Quantity of students = " + quantityOfStudents +
                ", course = " + course +
                '}';
    }
}

enum Season {
    AUTUMN {
        public String CurrentSemester() { return "First semester"; }
    },
    WINTER {
        public String CurrentSemester() { return "Winter Exams"; }
    },
    SPRING {
        public String CurrentSemester() { return "Second semester"; }
    },
    SUMMER {
        public String CurrentSemester() { return "Vacation Period"; }
    };
    public abstract String CurrentSemester();

}
