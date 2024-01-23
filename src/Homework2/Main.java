package Homework2;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Main.task6();
        Main.task11();

    }

    public static void task6() {

        double a, b, c, p, area;
        System.out.println("Enter the length of the first side");
        a = in.nextDouble();
        System.out.println("Enter the length of the second side");
        b = in.nextDouble();
        System.out.println("Enter the length of the third side");
        c = in.nextDouble();

        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("The area of the triangle is: " + area);
        System.out.println("The perimeter of the triangle is: " + p);

    }

    public static void task11() {
        // B.

        int input, result;
        System.out.println("Enter a number");
        input = in.nextInt();
        result = input / Math.abs(input);
        System.out.println("The result is: " + result);


    }

}
