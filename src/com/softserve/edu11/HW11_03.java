package com.softserve.edu11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11_03 {

    private static final String search = """
            Coat: 120.00$,
            pants: 75.25$,
            snickers: 150.15$
            """;
    private static final String pattern = "[0-9]+\\.[0-9][0-9]\\$";

    public static void main(String[] args) {
        Matcher matcher = Pattern.compile(pattern).matcher(search);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

}
