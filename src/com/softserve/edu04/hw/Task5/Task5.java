package com.softserve.edu04.hw.Task5;

public class Task5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik", Breed.BULLDOG, 5);
        Dog dog2 = new Dog("Sharik", Breed.BOXER, 6);
        Dog dog3 = new Dog("Laika", Breed.BEAGLE, 7);

        System.out.println(checkDoubleName(dog1, dog2, dog3));

        Dog theOldestDog = dog1;
        if(dog2.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog2;
        }
        if(dog3.getAge() > theOldestDog.getAge()) {
            theOldestDog = dog3;
        }

        System.out.println("The name of the oldest dog is " + theOldestDog.getName() +
                ". His breed is " + theOldestDog.getBreed());
    }

    public static boolean checkDoubleName(Dog dog1, Dog dog2, Dog dog3) {
        return  dog1.equals(dog2) ||
                dog1.equals(dog3) ||
                dog2.equals(dog3) ||
                dog2.equals(dog1) ||
                dog3.equals(dog1) ||
                dog3.equals(dog2);
    }
}
