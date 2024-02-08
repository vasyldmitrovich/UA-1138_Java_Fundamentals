package com.softserve.edu04.hw;

public class hw5 {
    public static void main(String[] args) {
        Dog.Breed breed1 = Dog.Breed.BEAGLE;
        Dog dog1 = new Dog("Pepper", breed1, 8);
        Dog.Breed breed2 = Dog.Breed.BEAGLE;
        Dog dog2 = new Dog("Pepper", breed2, 2);
        Dog.Breed breed3 = Dog.Breed.LABRADOR;
        Dog dog3 = new Dog("Tomas", breed2, 14);

        String message = new String();

        if (dog1.getName() == dog2.getName()){
            message = "There are two dogs with the same name!";
            System.out.println(message);
        }
        if (dog2.getName() == dog3.getName()){
            message = "There are two dogs with the same name!";
            System.out.println(message);
        }
        if (dog1.getName() == dog3.getName()) {
            message = "There are two dogs with the same name!";
            System.out.println(message);
        }
        if (message == null){
            System.out.println("No two dogs have the same name!");
        }

        int oldest = dog1.getAge();

        if (oldest < dog2.getAge()){
            oldest = dog2.getAge();
        } else if (oldest < dog3.getAge()) {
            oldest = dog3.getAge();
        }
        System.out.println("The oldest dog, " + oldest +  " years old, has a name and breed:");

        if (oldest == dog1.getAge()){
            System.out.println(dog1.getName() + " and " + dog1.getBreed());
        }
        if (oldest == dog2.getAge()){
            System.out.println(dog2.getName() + " and " + dog2.getBreed());
        }
        if (oldest == dog3.getAge()){
            System.out.println(dog3.getName() + " and " + dog3.getBreed());
        }
    }
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {// Move to Bread.java
        LABRADOR,
        BEAGLE,
        GERMAN_SHEPHERD,
        BULLDOG,
        GOLDEN_RETRIEVER;

    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed.toString().toLowerCase();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                ", age = " + age +
                '}';
    }
}


