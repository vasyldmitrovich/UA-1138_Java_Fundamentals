package com.softserve.edu12.pt.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(Type type, Color color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("This is a plant of type %s, color %s, size %d",
                type.toString().toLowerCase(),
                color.toString().toLowerCase(),
                size);
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list " + Arrays.toString(Color.values()));
    }

    static Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list " + Arrays.toString(Type.values()));
    }

    static Plant readFromConsole() {
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the plant parameters:");
                System.out.println("Enter type:");
                String typeStr = scan.nextLine();
                System.out.println("Enter color:");
                String colorStr = scan.nextLine();
                System.out.println("Enter size:");
                int size = Integer.parseInt(scan.nextLine());
                Color color = colorStrToEnum(colorStr);
                Type type = typeStrToEnum(typeStr);
                return new Plant(type, color, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}
