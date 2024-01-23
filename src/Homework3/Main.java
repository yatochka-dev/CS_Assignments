package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Main.task1();
        Main.task2();
        Main.task3();
        Task4.main(args);

    }

    public static void task1() {
        int num1, num2, num3, ran1, ran2, min, max;

        num1 = getNumberInput(false);
        num2 = getNumberInput(false);
        num3 = getNumberInput(false);

        min = Arrays.stream(new int[]{num1, num2, num3}).min().orElseThrow();
        max = Arrays.stream(new int[]{num1, num2, num3}).max().orElseThrow();

        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);

        // find 2 random numbers between min and max
        ran1 = (int) (Math.random() * (max - min + 1) + min);
        ran2 = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("The first random number is: " + ran1);
        System.out.println("The second random number is: " + ran2);
    }

    public static void task2() {
        int ran1, ran2, ran3, ran4;
        String res;

        // generating 4 random numbers 1-9
        ran1 = (int) (Math.random() * 9 + 1);
        ran2 = (int) (Math.random() * 9 + 1);
        ran3 = (int) (Math.random() * 9 + 1);
        ran4 = (int) (Math.random() * 9 + 1);

        // compiling the numbers into a string
        res = "" + ran1 + ran2 + ran3 + ran4;

        System.out.println("The random number is: " + res);

    }

    public static void task3() {
        int ran1, ran2, sum;

        // generating 2 random numbers 10-99

        ran1 = (int) (Math.random() * 90 + 10);
        ran2 = (int) (Math.random() * 90 + 10);

        sum = (int) (Math.pow(ran1, 2) + Math.pow(ran2, 2));


        System.out.println("The sum of the squares is: " + sum);


    }


    public static int getNumberInput(Boolean check) {
        // checks if needed (for task 4)
        int number;
        System.out.println("Enter a number: ");
        number = in.nextInt();

        if ((number < 1000 || number > 9999) || !check) {
            System.out.println("Enter a number that's 1000-9999");
            number = getNumberInput(check);
        }
        return number;
    }
}
