package com.softserve.edu12.pt;

import java.util.Arrays;
import java.util.Scanner;

import static com.softserve.edu12.pt.Plant.colorStrToEnum;
import static java.lang.System.in;

public class Pt2 {
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
    WHITE, RED, BLUE
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

    public Plant(String typeStr, String colorStr, int size) throws ColorException, TypeException {
        Color color = colorStrToEnum(colorStr);
        Type type = typeStrToEnum(typeStr);
        this.size = size;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("This is a plant of type %s of color %s of size %d",
                type.toString().toLowerCase(),
                color.toString().toLowerCase(),
                size);
    }

    static Plant readFromConsole() {
        while (true) {
            Scanner scanner = new Scanner(in);
            try {
                System.out.println("Enter the plant parameters.");
                System.out.print("Enter type:");
                String typeStr = scanner.nextLine();
                System.out.print("Enter color:");
                String colorStr = scanner.nextLine();
                System.out.print("Enter the size:");
                int size = Integer.parseInt(scanner.nextLine());
                return new Plant(typeStr, colorStr, size);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be a number");
            }
        }
    }

    static Type typeStrToEnum(String typeStr)
            throws TypeException
    {
        for (var type : Type.values()) {
            if (typeStr.equalsIgnoreCase(type.name())) {
                return type;            }
        }
        throw new TypeException("Input a type from the list: " +
                Arrays.toString(Type.values()));
    }


    static Color colorStrToEnum(String colorStr)
            throws ColorException
    {
        for (var color : Color.values()) {
            if (colorStr.equalsIgnoreCase(color.name())) {
                return color;            }
        }
        throw new ColorException("Input a color from the list: " +
                Arrays.toString(Color.values()));
    }
}


/*



3.
public class Plant {
   private Type type;
   private Color color;
   private int size;

   public Plant(String type, String color, int size) throws ColorException, TypeException{
      Color c = colorStrToEnum(color);
      Type t = typeStrToEnum(type);
      this.size = size;
      this.type = t;
      this.color = c;
   }

   private Color colorStrToEnum(String color) throws ColorException{
      switch(color.toLowerCase()){
         case "blue" : return Color.Blue;
         case "red" : return Color.Red;
         case "white" : return Color.White;
         default : throw new ColorException("Input only color blue, red or white");
      }
   }
 …
@Override
public String toString() {
…

}

4.
public static void main(String[] args) {
   try {
      Plant pl = new Plant("rose", "blue", 5);
      System.out.println(pl);
   } catch (ColorException | TypeException e) {
      System.err.println(e.getMessage() + "\n");
      //e.printStackTrace();
   }
}

/*
  */