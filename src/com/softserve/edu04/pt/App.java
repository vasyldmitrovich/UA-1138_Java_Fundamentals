package com.softserve.edu04.pt;

import java.util.Scanner;

import static java.lang.System.in;

public class App {
    public static void main(String[] args) {
        // Task 1
//        App.task1();

        // Task 2
//        App.task2();

        // Task 3
        App.task3();

        //Task 4
        Product product1 = new Product("apple", 3, 1);
        Product product2 = new Product("banana", 4, 2);
        Product product3 = new Product("orange", 5, 3);
        Product product4 = new Product("kiwi", 8, 4);

//        if (product1.getPrice()> product2.getPrice())

    }

    public static int task1() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the firs number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int amountOfOddNumbers = 0;

        if (firstNumber % 2 != 0) {
            amountOfOddNumbers++;
        }
        if (secondNumber % 2 != 0) {
            amountOfOddNumbers++;
        }
        if (thirdNumber % 2 != 0) {
            amountOfOddNumbers++;
        }

        System.out.println(amountOfOddNumbers);
        return amountOfOddNumbers;
    }

    public static void task2() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the day of the week");
        int weekDay = scanner.nextInt();
        switch (weekDay) {
            case 1 -> DayOfTheWeek.DAY_1.printNameOfDay();
            case 2 -> DayOfTheWeek.DAY_2.printNameOfDay();
            case 3 -> DayOfTheWeek.DAY_3.printNameOfDay();
            case 4 -> DayOfTheWeek.DAY_4.printNameOfDay();
            case 5 -> DayOfTheWeek.DAY_5.printNameOfDay();
            case 6 -> DayOfTheWeek.DAY_6.printNameOfDay();
            case 7 -> DayOfTheWeek.DAY_7.printNameOfDay();
        }
    }

    public enum DayOfTheWeek {
        DAY_1("Понеділок", "Monday"), DAY_2("Вівторок", "Tuesday"), DAY_3("Середа", "Wednesday"), DAY_4("Четвер", "Thursday"), DAY_5("П'ятниця", "Friday"), DAY_6("Субота", "Saturday"), DAY_7("Неділя", "Sunday");
        private final String uaName;
        private final String enName;

        DayOfTheWeek(String uaName, String enName) {
            this.uaName = uaName;
            this.enName = enName;
        }

        public void printNameOfDay() {
            System.out.println(uaName + " " + enName);
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the name of a country");
        String country = scanner.nextLine();

        String result = switch (country) {
            case "Ukraine", "Italy", "Poland" -> "" + Continent.EUROPE;
            case "Algeria", "Angola", "Benin" -> "" + Continent.AFRICA;
            case "China", "India", "Turkey" -> "" + Continent.ASIA;
            default -> "No information about continent";
        };

        System.out.println(country + " belongs to " + result);


    }

    public enum Continent {
        EUROPE, ASIA, AFRICA;
    }
}
