package com.softserve.edu08.hw;

public class hw1 {
    public static void main(String[] args) {
        FullName fullName = new FullName("Bob", "Ford");
        Person person = new Person(fullName, 18) {
            @Override
            public String activity() {
                return "I'm programmer";
            }
        };

        System.out.println(person.info());
        System.out.println(person.activity());
    }
}
