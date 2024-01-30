package com.softserve.edu04.hw;

public class HwTask5 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("sharik", Breed.B1.getBreed1(), 2);
        Dog dog2 = new Dog("sharik", Breed.B2.getBreed1(), 3);
        Dog dog3 = new Dog("pol", Breed.B3.getBreed1(), 8);
        System.out.println("1st dog: " + dog1);
        System.out.println("2nd dog: " + dog2);
        System.out.println("3d dog: " + dog3);

        checkSame(dog1, dog2, dog3);

        Dog oldestDog = findOldest(dog1, dog2, dog3);
        System.out.println("Oldest dog name: " + oldestDog.getName() + ", Breed: " + oldestDog.getBreed());
    }

    private static Dog findOldest(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldest = dog1;
        if (dog2.getAge() > oldest.getAge()) {
            oldest = dog2;
        }
        if (dog3.getAge() > oldest.getAge()) {
            oldest = dog3;
        }
        return oldest;
    }

    private static void checkSame(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2.getName()) ||
                dog2.getName().equals(dog3.getName()) ||
                dog1.getName().equals(dog3.getName())
        ) {
            System.out.println("There are dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }
    }
}

class Dog {
    private final String name;
    private final String breed;
    private final int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

enum Breed {
    B1("corgis"),
    B2("husky"),
    B3("spitz");
    final String breed1;

    Breed(String breed1) {
        this.breed1 = breed1;
    }

    public String getBreed1() {
        return breed1;
    }
}