/*package com.softserve.edu04.hw;

import java.util.Scanner;

public class HW4 {
        public static void hw10(String[] args) {
            final Scanner SCANNER = new Scanner(System.in);
            System.out.println("Input number of students ");
            int quantity = SCANNER.nextInt();

            com.softserve.edu04.hw.HW3.ErrorNumber error = com.softserve.edu04.hw.HW3.ErrorNumber.getNumber(inputnumber);
            System.out.println("The error message is  " + error.getDescription() );
        }

        public static class Faculty {
            int quantity;
            String currentSeason;

            public Faculty(int quantity, String currentSeason) {
                this.quantity = quantity;
                this.currentSeason = currentSeason;
            }



        }
        enum Season {
            WINTER (1, "Winter"), AUTUMN (2, "Autumn"), SUMMER (3, "Summer"), SPRING(4, "Spring");

            final int number;
            final String description;

            Season(int number, String description) {
                this.number = number;
                this.description = description;
            }
            public static Season getNumber(int inputnumber){
                return switch (inputnumber){
                    case 1 -> WINTER;
                    case 2 -> AUTUMN;
                    case 3 -> SUMMER;
                    case 4 -> SPRING;
                    default -> null;

                };

            }

            }

        }
*/
