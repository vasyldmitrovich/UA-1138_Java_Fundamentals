package com.softserve.edu16.hw.Task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String inputFile = "src/com/softserve/edu16/hw/Task2/file1.txt";
        String outputFile = "src/com/softserve/edu16/hw/Task2/file2.txt";

        try {
            modifyAndWriteFile(inputFile, outputFile);
            System.out.println("The file has been overwritten");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void modifyAndWriteFile(String inputFile, String outputFile) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
    }
}
