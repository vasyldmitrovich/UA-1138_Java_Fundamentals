package com.softserve.edu16.hw.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        String fileName1 = "src/com/softserve/edu16/hw/Task1/file1.txt";
        String fileName2 = "src/com/softserve/edu16/hw/Task1/file2.txt";

        try {
            List<String> lines = readLinesFromFile(fileName1);

            if (lines != null) {
                writeToFile(fileName2, lines.size(), findLongestLine(lines), "Illia Voitsekhovskyi", "13.06.1997");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readLinesFromFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static String findLongestLine(List<String> lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }

    private static void writeToFile(String fileName, int numberOfLines, String longestLine, String name, String birthday) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Number of lines in file1.txt: " + numberOfLines);
            bw.newLine();
            bw.write("The longest line in file1.txt: " + longestLine);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Birthday Date: " + birthday);
        }
    }
}
