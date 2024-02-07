package com.softserve.edu04.hw;

import java.util.Objects;
import java.util.Scanner;

public class Hw05 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog.input(dog1);

        Dog dog2 = new Dog();
        Dog.input(dog2);

        Dog dog3 = new Dog();
        Dog.input(dog3);

        Dog.oldestDog(dog1, dog2, dog3);
        Dog.sameNameDog(dog1, dog2, dog3);
    }
}

class Dog {
    public static final Scanner SCANNER = new Scanner(System.in);
    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void input(Dog dog) {
        System.out.println("Input dog name: ");
        String name = SCANNER.nextLine();
        dog.setName(name);
        System.out.println("Input" + '\'' + name + '\'' + "breed: ");
        String breed = SCANNER.nextLine();
        dog.setBreed(Breed.getBreed(breed).getBr());
        System.out.println("Input age: ");
        int age = SCANNER.nextInt();
        dog.setAge(age);
        SCANNER.nextLine();
    }

    public static void oldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldest = dog1;
        if (oldest.getAge() < dog2.getAge()) {
            oldest = dog2;
        }
        if (oldest.getAge() < dog3.getAge()) {
            oldest = dog3;
        }
        System.out.println("Oldest dog is: " + oldest.getName() + " " + oldest.getBreed());
    }

    public static void sameNameDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("First dog and Second dog have same name: " + dog1.getName());
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("First dog and Third dog have same name: " + dog1.getName());
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("Second dog and Third dog have same name: " + dog2.getName());
        } else {
            System.out.println("Dogs do not have the same name!!!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

enum Breed {
    LABRADOR_RETRIEVER("Labrador retriever"),
    FRENCH_BULLDOG("French bulldog"),
    GOLDEN_RETRIEVER("Golden retriever"),
    BULLDOG("Bulldog"),
    POODLE("Poodle"),
    BEAGLE("Beagle"),
    ROTTWEILER("Rottweiler"),
    DACHSHUND("Dachshund");

    private final String br;

    Breed(String br) {
        this.br = br;
    }

    public String getBr() {
        return br;
    }

    public static Breed getBreed(String breed) {
        return switch (breed) {
            case "Labrador retriever" -> LABRADOR_RETRIEVER;
            case "French bulldog" -> FRENCH_BULLDOG;
            case "Golden retriever" -> GOLDEN_RETRIEVER;
            case "Bulldog" -> BULLDOG;
            case "Poodle" -> POODLE;
            case "Beagle" -> BEAGLE;
            case "Rottweiler" -> ROTTWEILER;
            case "Dachshund" -> DACHSHUND;
            default -> throw new IllegalArgumentException("Do not have this breed");
        };
    }
}
