package com.softserve.edu07.pt;

public class Ptask1 {//All good but write each class in separate file like Animal.java Cat.java etc...
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

    interface Animal {
        void voice();

        void feed();
    }

    static class Cat implements Animal {
        public void voice() {
            System.out.println("Meow");
        }

        public void feed() {
            System.out.println("Feeding the cat");
        }
    }

    static class Dog implements Animal {
        public void voice() {
            System.out.println("Woof");
        }

        public void feed() {
            System.out.println("Feeding the dog");
        }
    }
}
