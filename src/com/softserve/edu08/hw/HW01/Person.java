package com.softserve.edu08.hw.HW01;

class Person {
    private int age;
    private FullName fullName;

    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return (getFullName().firstnName + getFullName().lastName + getAge());
    }

    public String activity() {
        return "Working";
    }


}
