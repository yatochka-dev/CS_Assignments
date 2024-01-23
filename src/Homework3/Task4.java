package Homework3;

import java.util.Arrays;

import static Homework3.Main.getNumberInput;

public class Task4 {


    private static void printNumberInfo(int num) {
        int thousands_digit = num / 1000;
        int hundreds_digit = (num % 1000) / 100;
        int tens_digit = (num % 100) / 10;
        int units_digit = num % 10;

        int sum = thousands_digit + hundreds_digit + tens_digit + units_digit;
        int multi = thousands_digit * hundreds_digit * tens_digit * units_digit;


        System.out.println("The number is: " + num);
        System.out.println("The sum of the digits is: " + sum);
        System.out.println("The multiplication of the digits is: " + multi);


    }

    public static void main(String[] args) {
        int num1, num2, num3, num4, min, max;

        num1 = getNumberInput(true);
        num2 = getNumberInput(true);
        num3 = getNumberInput(true);
        num4 = getNumberInput(true);

        min = Arrays.stream(new int[]{num1, num2, num3, num4}).min().orElseThrow();
        max = Arrays.stream(new int[]{num1, num2, num3, num4}).max().orElseThrow();

        printNumberInfo(min);
        printNumberInfo(max);
    }
}
