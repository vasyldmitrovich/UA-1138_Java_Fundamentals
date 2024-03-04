package com.softserve.edu08.hw.hw01_02;

abstract class Person {
    FullName fullName;
    int age;

    protected Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    String info(){
        return "First name: <" + fullName.getFirstName() + ">, " +
                "Last name: <" + fullName.getLastName() + ">, " +
                "Age: " + '<' + getAge() + '>';
    }

    public abstract String activity();
}
