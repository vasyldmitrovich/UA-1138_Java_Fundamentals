package com.softserve.edu08.hw.HW01;

public class main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John ", "Dow ");
        Person person = new Person(18, fullName) {
            @Override
            public String activity() {
                return "Working";
            }
        };
        System.out.println(person.info() + person.activity());

    }
}
