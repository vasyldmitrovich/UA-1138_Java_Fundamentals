package com.softserve.edu09.hw.Task2;

public class Grade {
    private String subject;
    private double score;

    public Grade(String subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}

