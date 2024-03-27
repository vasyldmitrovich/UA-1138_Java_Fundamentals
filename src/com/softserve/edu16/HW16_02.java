package com.softserve.edu16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HW16_02 {

    public static void main(String[] args) throws FileNotFoundException {
        String pathReadFile = new File("src/com/softserve/edu16/file1.txt").getAbsolutePath();
        String pathWriteFile = new File("src/com/softserve/edu16/file2.txt").getAbsolutePath();

        FileReader in = new FileReader(pathReadFile);
        int lineNumbers = 0;
        int max = 0;
        String longestLine = null;
        String nameLine = null;
        String birthLine = null;
        try (BufferedReader br = new BufferedReader(in)) {
            PrintWriter out = new PrintWriter(pathWriteFile);
            String line;
            while ((line = br.readLine()) != null) {
                if (max < line.length()) {
                    max = line.length();
                    longestLine = line;
                }
                lineNumbers++;
                if (line.contains("Name")) {
                    nameLine = line;
                }

                if (line.contains("Date of birth")) {
                    birthLine = line;
                }
            }

            out.println("Number of lines:" + lineNumbers);
            out.println("The longest line:" + longestLine);
            out.println(nameLine + " " + birthLine);

            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
