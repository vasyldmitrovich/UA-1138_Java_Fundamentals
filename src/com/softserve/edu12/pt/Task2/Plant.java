package com.softserve.edu12.pt.Task2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Type type = typeStrToEnum(typeStr);
        Color color = colorStrToEnum(colorStr);
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if(colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list: " + Arrays.toString(Color.values()));
    }

    public static Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if(typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list: " + Arrays.toString(Type.values()));
    }


    public static Plant readFromConsole() {
        Scanner scanner = new Scanner(in);

        while (true) {
            try {
                System.out.println("Enter the plant parameters.");
                System.out.print("Enter type:");
                String typeStr = scanner.nextLine();

                System.out.print("Enter color:");
                String colorStr = scanner.nextLine();

                System.out.print("Enter size:");
                int size = Integer.parseInt(scanner.nextLine());

                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }

    }

    @Override
    public String toString() {
        return "This is a type %s of color %s of size %d".formatted(
                type.toString().toLowerCase(),
                color.toString().toLowerCase(),
                size);
    }

    public enum Color {
        WHITE, RED, BLUE;
    }

    public enum Type {
        GRASS, BUSH, TREE;
    }
}
