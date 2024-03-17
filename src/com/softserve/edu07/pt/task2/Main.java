package com.softserve.edu07.pt.task2;

public class Main {
    public static void main(String[] args) {
        Person[] people = {new Cleaner(), new Teacher(), new Student(),};

        for (Person person : people) {
            person.print();
            if (person instanceof Cleaner) {
                System.out.print(((Cleaner) person).TYPE_PERSON);
                System.out.print(". My salary: ");
                ((Staff) person).salary();
            }
            if (person instanceof Teacher) {
                System.out.print(((Teacher) person).TYPE_PERSON);
                System.out.print(". My salary: ");
                ((Staff) person).salary();
            }
            if (person instanceof Student) {
                System.out.print(((Student) person).TYPE_PERSON);
            }
        }
    }
}
