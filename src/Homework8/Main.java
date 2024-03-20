package Homework8;

import java.util.*;

public class Main {


    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        task54();

//        task55();
    }

    public static void task54() {

        int input, mostFrequent, highestNumber = 0, temp8 = 9, temp9 = 9, temp10 = 0;
        double averageNumber, sum = 0;
        Random rand = new Random();

        System.out.println("Enter a positive number: ");
        input = in.nextInt();


        for (int i = 0; i < input; i++) {
            int gen = rand.nextInt(3) + 8;
            if (gen > highestNumber) highestNumber = gen;

            switch (gen) {
                case (8) -> temp8++;
                case (9) -> temp9++;
                case (10) -> temp10++;
            }
            sum += gen;


        }
        averageNumber = sum / input;

        if (temp8 > temp9 && temp8 > temp10) mostFrequent = 8;
        else if (temp9 > temp10) mostFrequent = 9;
        else mostFrequent = 10;



        System.out.printf("The number that was generated the most times is: %d.\n", mostFrequent);
        System.out.printf("The average number is %f.\n", averageNumber);
        System.out.printf("The highest number is %d.\n", highestNumber);

    }

    public static void task55() {

        int n, minDiff = 2147483647, centerValue, currentDiff, tempNum1 = 0, tempNum2 = 0; // 1-9
        double average;
        int sum = 0, num1 = 0;

        n = inputN();


        int numbersLength = 0;
        for (int i = 0; i < n; i++) {
            int inp = inputNumber(1, 999);
            sum += inp;
            numbersLength++;

            if (i > 0) {
                currentDiff = Math.abs(inp - num1);
                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    tempNum1 = num1;
                    tempNum2 = inp;
                }
            }
            num1 = inp;
        }

        average = (double) sum / numbersLength;
        centerValue = sum / numbersLength;


        System.out.printf("Average number is %f.\n", average);
        System.out.printf("Closest pair of numbers is %d and %d with the difference of %d.\n",
                Math.min(tempNum1, tempNum2), Math.max(tempNum1, tempNum2), minDiff);
        System.out.printf("The center value is %d.\n", centerValue);


    }

    private static int inputNumber(int min, int max) {
        int num;
        System.out.printf("Enter number between %d and %d.", min, max);
        num = in.nextInt();

        if (num < min || num > max) {
            return inputNumber(min, max);
        }

        return num;
    }

    private static int inputN() {
        int num;
        System.out.println("Enter number odd.");
        num = in.nextInt();

        if (num % 2 == 0) {
            return inputN();
        }

        return num;
    }

}
