package com.softserve.edu11.hw.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String inuputString = "The cost of the laptop is $999.99. I paid 20.50 dollars for shipping and handling. The total amount due is 1020.49$.";

        System.out.println(validateUScurrencyFormat(inuputString));
    }

        public static List<String> validateUScurrencyFormat(String inuputString) {
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(inuputString);

        List <String> result = new ArrayList<>();

        while (m.find()) {
            result.add(inuputString.substring(m.start(), m.end()));
        }
        return result;
    }
}