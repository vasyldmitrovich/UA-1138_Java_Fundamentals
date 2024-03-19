package com.softserve.edu12.pt.pt02;

import java.util.Arrays;
import java.util.Scanner;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String colorStr, String typeStr) throws ColorException, TypeException {
        this.size = size;
        this.color = colorStrToEnum(colorStr);
        this.type = typeStrToEnum(typeStr);
    }

    static Type typeStrToEnum(String typeStr) throws TypeException {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;
            }
        }
        throw new TypeException("Input a type from the list: " +
                Arrays.toString(Type.values()));
    }

    static Color colorStrToEnum(String colorStr) throws ColorException {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;
            }
        }
        throw new ColorException("Input a color from the list: " +
                Arrays.toString(Color.values()));
    }

    @Override
    public String toString() {
        return "This is a plant of type %s of color %s of size %d"
                .formatted(
                        type.toString().toLowerCase(),
                        color.toString().toLowerCase(),
                        size);
    }

    static Plant readFromConsole(){
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the plant parameters.");
                System.out.println("Enter type: ");
                String typeStr = scan.nextLine();
                System.out.println("Enter color: ");
                String colorStr = scan.nextLine();
                System.out.println("Enter size: ");
                int size = Integer.parseInt(scan.nextLine());
                return  new Plant(size, colorStr, typeStr);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Size should be a number");
            }
        }
    }
}