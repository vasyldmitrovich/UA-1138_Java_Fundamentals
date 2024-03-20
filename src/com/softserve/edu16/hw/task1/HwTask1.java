package com.softserve.edu16.hw.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HwTask1 {
    public static void main(String[] args) {
        createFile1();

        ArrayList<String> lines = readFileIntoArray("src/com/softserve/edu16/hw/task1/file1.txt");

        int numberOfLines = lines.size();
        String longestLine = findLongestLine(lines);

        writeInfoToFile2(numberOfLines, longestLine);
    }


    public static void createFile1() {
        try {
            FileWriter writer = new FileWriter("src/com/softserve/edu16/hw/task1/file1.txt");
            writer.write("This is a text about my career\n");
            writer.write("asfafffff\n");
            writer.write("asff5464564564\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readFileIntoArray(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static String findLongestLine(ArrayList<String> lines) {
        String longestLine = "";
        for (String line : lines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        return longestLine;
    }

    public static void writeInfoToFile2(int numberOfLines, String longestLine) {
        try {
            FileWriter writer = new FileWriter("src/com/softserve/edu16/hw/task1/file2.txt");
            writer.write("Number of lines in file1.txt: " + numberOfLines + "\n");
            writer.write("Longest line in file1.txt: " + longestLine + "\n");
            writer.write("Name: Artem\n");
            writer.write("Birthday Date: 01.12.2003\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
