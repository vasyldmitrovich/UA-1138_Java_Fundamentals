package com.softserve.edu16.hw;

import java.io.*;

public class Hw2 {
    public static void main(String[] args) {
        String inputFile = "ExampleClass.java";

        try {
            modifyJavaFileInPlace(inputFile);
            System.out.println("Java code modified and saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void modifyJavaFileInPlace(String inputFile) throws IOException {
        File file = new File(inputFile);
        if (!file.exists()) {
            System.out.println("File not found: " + inputFile);
            return;
        }

        StringBuilder modifiedContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = replacePublicWithPrivate(line);
                modifiedContent.append(line).append("\n");
            }
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(modifiedContent.toString());
        }
    }

    private static String replacePublicWithPrivate(String line) {
        if (line.contains("public") && (line.contains("class ") || line.contains("("))) {
            return line.replace("public", "private");
        }
        return line;
    }
}
