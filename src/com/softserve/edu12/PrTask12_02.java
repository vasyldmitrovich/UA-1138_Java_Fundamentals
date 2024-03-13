package com.softserve.edu12;

import java.util.Arrays;
import java.util.Scanner;

public class PrTask12_02 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[2];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = Plant.readFromConsole();
        }
        for (var plant : plants) {
            System.out.println(plant);
        }
    }
}

enum Color {
    BLUE, ORANGE, YELLOW
}

enum Type {
    GRASS, BUSH, TREE, ROSE
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size)
            throws ColorException, TypeException {
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.type = type;
        this.color = color;
        this.size = size;
    }

    static Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list: "
                + Arrays.toString(Type.values()));
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list: "
                + Arrays.toString(Color.values()));

    }

    static Plant readFromConsole() {
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the plant parameters: ");
                System.out.println("Enter type: ");
                String typeStr = scan.nextLine();
                System.out.println("Enter color: ");
                String colorStr = scan.nextLine();
                System.out.println("Enter size: ");
                int size = Integer.parseInt(scan.nextLine());
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
        return "This is a plant of type %s of color %s of size %d"
                .formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }
}

