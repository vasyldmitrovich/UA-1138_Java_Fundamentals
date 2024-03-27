package com.softserve.edu16;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HW16_01 {

    public static void main(String[] args) throws FileNotFoundException {

        String pathReadFile = new File("src/com/softserve/edu16/Employee.java").getAbsolutePath();
        String pathWriteFile = new File("src/com/softserve/edu16/EmployeeUpdated.txt").getAbsolutePath();

        FileReader in = new FileReader(pathReadFile);
        try (BufferedReader br = new BufferedReader(in)) {
            PrintWriter out = new PrintWriter(pathWriteFile);
            String line;
            while ((line = br.readLine()) != null) {
                out.println(line.replace("public", "private"));
            }
            out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
