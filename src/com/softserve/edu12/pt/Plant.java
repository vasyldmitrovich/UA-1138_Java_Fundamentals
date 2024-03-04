package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.type = type;
        this.color = color;
        this.size = size;
    }

    private Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list: " + Arrays.toString(Type.values()));
    }

    private Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list: " + Arrays.toString(Color.values()));
    }

    @Override
    public String toString() {
        return "This is a plant of type %s of color %s of size %d"
                .formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }

    public static Plant readFromConsole() throws ColorException, TypeException {
        Scanner scan = new Scanner(in);
        while (true) {
            try {
                System.out.println("Enter the plant parameters.");

                System.out.println("Enter the type: ");
                String typeStr = scan.nextLine();

                System.out.println("Enter the color: ");
                String colorStr = scan.nextLine();

                System.out.println("Enter the size: ");
                int size = Integer.parseInt(scan.nextLine());

                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }
}
