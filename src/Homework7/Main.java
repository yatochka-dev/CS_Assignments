package Homework7;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        task34();
//        task36();
//        task39();

    task40();
    }



    public static void task34() {
        // n!
        int inp = in.nextInt();
        int res = 1;
        for (int i = inp; i != 1; i--) {
            res *= i;
        }

        System.out.println(res);
    }

    public static void task36() {

        int first, second, min, max;

        first = getRangeNumber(11, 99);
        second = getRangeNumber(11, 99);

        min = Math.min(first, second);
        max = Math.max(first, second);


        for (int i = min; i < max; i++) {
            int sum, product;

            int tens = i % 10;
            int units = i / 10;

            sum = units + tens;
            product = units * tens;

            System.out.printf("The number is: %d.\n", i);
            System.out.printf("The numbers sum is %d.\n", sum);
            System.out.printf("The numbers product is %d.\n", product);

        }


    }

    public static void task39() {

        int input = getRangeNumber(1, 999);

        int sum_of_divisors = 0;

        for (int i = 1; i < input; i++) {

            if (input % i == 0) {
                sum_of_divisors += i;
            }

        }


        if (input != sum_of_divisors) {
            System.out.print("Not a perfect number\n");
            return;
        }

        System.out.printf("%d is a perfect number\n", input);

    }

    public static void task40() {

        int m=1;
        int x = in.nextInt();
        int y = in.nextInt();
        for (int j = x; j <= y; j++) {
            System.out.print("body");
            m *= j;
        }

        System.out.println(m);

        // A.120
        // B. 1,1
        // C It won't go through if the second inout is smaller than the first one
        // D. To get the product of the number range from x to y

    }

    private static int getRangeNumber(int min, int max) {

        System.out.println("Enter a number: ");
        int raw = in.nextInt();

        if (raw < min || raw > max) {
            return getRangeNumber(min, max);
        }

        return raw;


    }

}
