package com.softserve.edu03.hw;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("James", "Bond");
        person1.setBirthYear(1977);
        person1.changeName("Ryan", "Ranolds");
        person1.output();
        System.out.println("The age of Person1 is " + person1.getAge());

        Person person2 = new Person();
        person2.input();
        person2.output();
        System.out.println("The age of Person2 is " + person2.getAge());

        Person person3 = new Person();
        person3.input();
        person3.output();
        System.out.println("The age of Person3 is " + person3.getAge());

        Person person4 = new Person();
        person4.input();
        person4.output();
        System.out.println("The age of Person4 is " + person4.getAge());

        Person person5 = new Person();
        person5.input();
        person5.output();
        System.out.println("The age of Person5 is " + person5.getAge());
    }


}
