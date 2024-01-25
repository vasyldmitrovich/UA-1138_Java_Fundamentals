package com.softserve.edu01.hw;

import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Homeworks

        // Task 1
        App.task1();
        myTask1();

        // Task 2...
    }

    public static void task1 () {
        System.out.println("Input your name");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);
    }
    // Task 1

    public static void myTask1() {
        Scanner first = new Scanner(System.in);
        System.out.println("Input first string:");
        String str1 = first.nextLine();
        System.out.println("Input second string:");
        String str2 = first.nextLine();
        System.out.println("Input third string:");
        String str3 = first.nextLine();
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }
}
//--------------------------------------------------------
/* Task 2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Input first number:");
        int str1 = Integer.parseInt(first.nextLine());
        System.out.println("Input second number:");
        int str2 = Integer.parseInt(first.nextLine());
        System.out.println("Input first third:");
        int str3 = Integer.parseInt(first.nextLine());
        double result = ((double)str1 + (double)str2 + (double)str3)/3;
        System.out.println("Average is: " + result);
    }
}
 */
//--------------------------------------------------------
/* Task 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Input A:");
        int a = Integer.parseInt(first.nextLine());
        System.out.println("Input B:");
        int b = Integer.parseInt(first.nextLine());

        while (a < b) {
            System.out.println("Values are incorrect, enter them again!");
            System.out.println("Input A:");
            a = Integer.parseInt(first.nextLine());
            System.out.println("Input B:");
            b = Integer.parseInt(first.nextLine());
        }

        System.out.println("Operation '+': " + (a + b));
        System.out.println("Operation '-': " + (a - b));
        System.out.println("Operation '*': " + (a * b));
        System.out.println("Operation '/': " + ((double)a / b));
        first.close();
    }
}
 */
//--------------------------------------------------------
/* Task 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("How are you?");
        String question = first.nextLine();
        System.out.println("You are " + question + ".");
    }
}

*/
//--------------------------------------------------------
/* Task 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner first = new Scanner(System.in);
        System.out.println("Input radius:");
        double r = Double.parseDouble(first.nextLine());
        double p = 2 * pi * r;
        double s = pi * r * r;
        System.out.println("Perimeter is: " + p);
        System.out.println("Area is: " + s);
        first.close();

    }
}
*/
//--------------------------------------------------------
/* Task 6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("What is your name?");
        String name  = first.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String live  = first.nextLine();
        System.out.println("Complete information:");
        System.out.println("You are " + name + ".");
        System.out.println("You live in " + live + ".");
        first.close();

    }
}
*/
//--------------------------------------------------------
/* Task 7
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);

        System.out.println("Price1:");
        double price1 = Double.parseDouble(first.nextLine());

        System.out.println("Price2:");
        double price2 = Double.parseDouble(first.nextLine());

        System.out.println("Price3:");
        double price3 = Double.parseDouble(first.nextLine());

        System.out.println("Duration of the first call:");
        double duration1 = Double.parseDouble(first.nextLine());

        System.out.println("Duration of the second call:");
        double duration2 = Double.parseDouble(first.nextLine());

        System.out.println("Duration of the third call:");
        double duration3 = Double.parseDouble(first.nextLine());

        double priceCall1 = price1*duration1;
        double priceCall2 = price2*duration2;
        double priceCall3 = price3*duration3;

        System.out.println("Price of the first call: " + priceCall1);
        System.out.println("Price of the second call: " + priceCall2);
        System.out.println("Price of the third call: " + priceCall3);

        System.out.println("Total price: " + (priceCall1+priceCall2+priceCall3));

        first.close();
    }
}
*/
//--------------------------------------------------------
