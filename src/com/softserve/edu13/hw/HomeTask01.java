package com.softserve.edu13.hw;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class HomeTask01 {
    public static void main(String[] args) {
        String input = "Let's start to study Java!";

        String encrypted = encrypt(input, 4);
        System.out.println(encrypted);

        String decrypted = decrypt(encrypted, 4);
        System.out.println(decrypted);

        System.out.println(dateFormat("01.31.25"));
        System.out.println(leapYear(2001));

        LocalDate birthday = LocalDate.of(2000, 1, 23);
        System.out.println(dayOfTheWeekAfter6Month(birthday));
        System.out.println(dayOfTheWeekAfter12Month(birthday));

    }

    public static String encrypt(String input, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char transformedChar = (char) ((ch - base + shift + 26) % 26 + base);
                result.append(transformedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String input, int shift) {
        return encrypt(input, -shift);
    }

    public static boolean dateFormat(String string) {
        boolean dateFormatIsValid;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
            formatter.parse(string);
            dateFormatIsValid = true;
        } catch (DateTimeException e) {
            dateFormatIsValid = false;
        }
        return dateFormatIsValid;
    }

    public static boolean leapYear(int year) {
        return Year.of(year).isLeap();
    }

    public static DayOfWeek dayOfTheWeekAfter6Month(LocalDate birthday) {
        return birthday.plusMonths(6).getDayOfWeek();
    }

    public static DayOfWeek dayOfTheWeekAfter12Month(LocalDate birthday) {
        return birthday.plusMonths(12).getDayOfWeek();
    }
}
