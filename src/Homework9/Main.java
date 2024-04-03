package Homework9;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        task16();
    }

    public static void task9() {

        int min = 100, max = 0;

        int input = in.nextInt();

        while (input > 0) {
            max = Math.max(input, max);
            min = Math.min(input, min);

            input = in.nextInt();
        }

        System.out.printf("The highest grade is %d.\n", max);
        System.out.printf("The lower grade is %d.", min);

    }


    public static void task10() {
        int y = 0, n = 0, d = 0;

        char input = in.next().charAt(0);

        while (input != 'f') {

            input = in.next().charAt(0);
            switch (input) {
                case 'y' -> y++;
                case 'n' -> n++;
                case 'd' -> d++;
            }
        }

        int total = y + n + d;
        boolean totalFor = y > (total * 0.6);

        if (totalFor) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
    }

    public static void task11() {
        int sum = 0;
        int inputLeft = in.nextInt();
        int inputRight = in.nextInt();

        while ((inputLeft * inputRight) != 0) {
            sum = (inputRight * inputLeft);

            inputLeft = in.nextInt();
            inputRight = in.nextInt();
        }

        if (sum > 0) {
            System.out.printf("The sum is positive: %d.", sum);
        } else {
            System.out.printf("The sum is negative: %d.", sum);
        }
    }

    public static void task16() {
        int sum = 0, i = 1;

        int count = in.nextInt();

        while (i <= count) {
            sum += (int) Math.pow(i, 2);
            i++;
        }

        System.out.println(sum);

        // 11

    }

    public static void task18() {
        Random rand = new Random();
        int first = rand.nextInt(6 - 1 + 1) + 1;
        int second = rand.nextInt(6 - 1 + 1) + 1;
        int sum = first + second;

        while (sum != 10) {
            first = rand.nextInt(6 - 1 + 1) + 1;
            second = rand.nextInt(6 - 1 + 1) + 1;
            sum = first + second;
        }

    }



}
