package com.softserve.edu04.hw;

public class HomeTask05 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rob", Breed.BEAGLE, 3);
        Dog dog2 = new Dog("Rob", Breed.POODLE, 7);
        Dog dog3 = new Dog("Bobby", Breed.BEAGLE, 5);

        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Dogs " + dog1.getBreed() + " and " + dog2.getBreed() + " have the same names " + dog1.getName());
        }

        if (dog1.getName().equals(dog3.getName())) {
            System.out.println("Dogs " + dog1.getBreed() + " and " + dog3.getBreed() + " have the same names " + dog1.getName());
        }

        if (dog3.getName().equals(dog2.getName())) {
            System.out.println("Dogs " + dog3.getBreed() + " and " + dog2.getBreed() + " have the same names " + dog1.getName());
        }

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is " + dog1.getName() + " and it breed is " + dog1.getBreed());
        } else if ((dog1.getAge() > dog2.getAge() && dog1.getAge() < dog3.getAge())) {
            System.out.println("The oldest dog is " + dog3.getName() + " and it breed is " + dog3.getBreed());
        } else {
            System.out.println("The oldest dog is " + dog2.getName() + " and it breed is " + dog2.getBreed());
        }

        System.out.println(Breed.getBreed("hhsbfk")); // Test get breed from a Breed enum
    }
}

