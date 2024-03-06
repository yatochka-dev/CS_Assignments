package Homework6;

import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        task13();
//        task14();
        task15();
    }

    public static void task15() {

        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int enteredRangeNumber = enterRangeNumber(10, 99);
            int tens = enteredRangeNumber / 10;
            int units = enteredRangeNumber % 10;
            int sum = tens + units;


            // for bet
            if (tens == units) continue;

            System.out.printf("The sum of %d digits is %d%n", enteredRangeNumber, sum);


        }


    }

    public static void task14() {
        int num = enterRangeNumber(10, 20);
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int rNum = random.nextInt(11) + 10;

            int min = Math.min(rNum, num);
            int max = Math.max(rNum, num);

            int diff = max - min;
            if (diff <= 4) {
                System.out.println(rNum);
            }

        }

    }

    public static void task13() {
        for (int i = 0; i <= 24; i++) {
            int number = EnterTwoDigitNumber();

            System.out.println(evaluate(number));

        }
    }


    private static String evaluate(int Number) {

        int firstDigit = Number / 10;
        int secondDigit = Number % 10;

        Boolean FirstDigitEven = IsEven(firstDigit);
        Boolean SecondDigitEven = IsEven(secondDigit);

        if (FirstDigitEven && SecondDigitEven) return "Two even digits";
        else if (!FirstDigitEven && !SecondDigitEven) return "Two odd Digits";
        else return "Mixed digits";


    }

    private static Boolean IsEven(int Number) {
        return Number % 2 == 0;
    }

    private static int EnterTwoDigitNumber() {
        System.out.println("Enter a two digit number: ");
        int number = in.nextInt();

        if (9 < number && number < 100) {
            return number;
        }


        return EnterTwoDigitNumber();

    }

    private static int enterRangeNumber(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int number = in.nextInt();

        if (min <= number && number <= max) {
            return number;
        }


        return EnterTwoDigitNumber();
    }
}
