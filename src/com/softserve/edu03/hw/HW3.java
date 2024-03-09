/*package com.softserve.edu03.hw;

import jdk.internal.icu.util.VersionInfo;
import java.time.LocalDate;
import java.util.Scanner;
import static jdk.internal.icu.lang.UCharacter.getAge;
public class HW3 {

    public static class Person {
        private String firstName;
        private String lastName;

        public Person() {
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;

        }

        public int getAge() {
            int today = LocalDate.now().getYear();
            return today - getBirthYear();

        }

        public void setBirthYear(int birthYear) {
        }

        public String getFirstName() {
            return null;
        }

        public String getLastName() {
            return null;
        }

        public int getBirthYear() {
            return 0;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;

        }
    }


    public void hw10(String... args) {

        Person person = new Person();

        System.out.println("Input first name: ");
        var scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);

        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);

        System.out.println("Input birth year: ");
        int birthYear = Integer.parseInt(scanner.nextLine());
        person.setBirthYear(birthYear);


        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Birth year: " + person.getBirthYear());

        VersionInfo age = getAge(person.getBirthYear());
        System.out.println("Age: " + age);
    }
}

*/
