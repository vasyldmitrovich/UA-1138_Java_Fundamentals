package com.softserve.edu08.hw;

public class HomeTask01 {
    public static void main(String[] args) {
        FullName fullName = new FullName("Johny", "Walker");
        Person person = new Person(fullName, 25) {
            @Override
            public String activity() {
                return "Studying Java";
            }
        };

        System.out.println(person.info());
        System.out.println(person.activity());
    }
}

