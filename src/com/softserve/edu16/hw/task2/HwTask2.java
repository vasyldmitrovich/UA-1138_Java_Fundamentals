package com.softserve.edu16.hw.task2;

import java.io.*;

public class HwTask2 {
    public static void main(String[] args) {
        String inputFile = "src/com/softserve/edu16/hw/task2/file3.txt";
        String outputFile = "src/com/softserve/edu16/hw/task2/file4.txt";

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Файл переписано.");
        } catch (IOException e) {
            System.err.println("Виникла помилка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}