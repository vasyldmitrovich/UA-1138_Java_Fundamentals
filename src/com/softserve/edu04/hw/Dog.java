package com.softserve.edu04.hw;

import java.util.Scanner;

public class Dog {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    String breed;
    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Ruddy", 5, Breed.Bulldog.breed);
        Dog dog2 = new Dog("Tobi", 12, Breed.Husky.breed);
        Dog dog3 = new Dog("Ruddy", 9, Breed.Chihuahua.breed);


        if (dog1.age > dog2.age && dog1.age > dog3.age) {
            System.out.println("The name of the oldest dog is " + dog1.name);
            System.out.println("Breed is " + dog1.breed);
        } else if (dog2.age > dog1.age && dog2.age > dog3.age) {
            System.out.println("The name of the oldest dog is " + dog2.name);
            System.out.println("Breed is " + dog2.breed);
        } else {
            System.out.println("The name of the oldest dog is " + dog3.name);
            System.out.println("Breed is " + dog3.breed);
        }

        if (dog1.name.equals(dog2.name)) {
            System.out.println("Dogs have the same names");
        } else if (dog1.name.equals(dog3.name)) {
            System.out.println("Dogs have the same names");
        } else {
            System.out.println("Dogs have the same names");
        }
    }

    String getName() {
        return name;
    }

    String setName(String newName) {
        name = newName;
        return name;
    }

    int getAge() {
        return age;
    }

    int setAge(int newAge) {
        age = newAge;
        return age;
    }

    String getBreed() {
        return breed;
    }

    String setBreed(String newBreed) {
        breed = newBreed;
        return breed;
    }

    enum Breed {
        Bulldog("Bulldog"),
        Chihuahua("Chihuahua"),
        Husky("Husky");

        final String breed;

        Breed(String breed) {
            this.breed = breed;
        }

    }
}
