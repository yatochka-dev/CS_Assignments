package Homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
        task8();
//        task9();

    }


    // even odd
    public static void task1() {
        int num = getNumberInput("");

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }


    public static void task2() {
        int age = getNumberInput("Enter your age: ");

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

    }


    public static void task3() {
        int grade = getNumberInput("Enter your grade: ");

        // I don't remember if it should be >= or just >. I'll go with >=
        if (grade >= 55) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }
    }

    public static void task4() {
        int num1, num2;
        num1 = getTwoDigitNumber();
        num2 = getTwoDigitNumber();

        String num1Str = Integer.toString(num1);
        String num2Str = Integer.toString(num2);

        char[] num1Arr = num1Str.toCharArray();
        char[] num2Arr = num2Str.toCharArray();

        Arrays.sort(num1Arr);
        Arrays.sort(num2Arr);

        if (Arrays.equals(num1Arr, num2Arr)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

    }


    public static void task5() {
        int num = getNumberInput("Enter a number: ");
        // 1-9
        int rand = (int) (Math.random() * 9 + 1);

        if (num == rand) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }


    public static void task6() {
        int num = getNumberInput("Enter a number: ");
        int num2 = getNumberInput("Enter a number: ");
        char operation = getOperationInput();


        System.out.println(calculate(num, num2, operation));
    }

    public static void task7() {
        int hypotenuseRaw, side1, side2;

        side1 = getNumberInput("Enter the first side: ");
        side2 = getNumberInput("Enter the second side: ");
        hypotenuseRaw = getNumberInput("Enter the hypotenuse: ");

        // pythagoeran theorem
        double side1SQ = Math.pow(side1, 2);
        double side2SQ = Math.pow(side2, 2);
        double hypotenuse = Math.sqrt(Math.pow(hypotenuseRaw, 2));

        if (side1SQ + side2SQ == hypotenuse) {
            System.out.println("You get 100 on math exam");
        } else {
            System.out.println("You get 0 on math exam");
        }
    }

    public static void task8() {
        char digit;
        char x;
        System.out.print("Enter a digit between 0 and 9: ");
        digit = in.next().charAt(0);
        if (digit == 'O')
            x = '9';
        else
            x = (char) (digit - 1);
        System.out.println(x);

        // 1. If the user enters '5', the output should be '4'
        // 2. If the user enters '9', the output should be '8'
        // 3. In summary, if the user enters '0', the program sets x to '9'. Otherwise, it sets x to the character one less than the entered digit. The purpose of the program is to perform this conditional operation and output the result.
    }

    public static void task9() {
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        if ((a < b) || (a < 100))
            System.out.println("The expression value: true");
        else
            System.out.println("The expression value: false");

        // 1. a=101, b=5
        // The first condition (a < b) doesn't work because a is clearly larger than b, the second condition (a < 100) doesn't work because a is clearly larger than 100. Therefore, the output should be "The expression value: false".
    }

    private static int calculate(Integer num1, Integer num2, Character operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };

    }


    private static int getNumberInput(String message) {
        int num;

        if (message.isEmpty()) {
            message = "Enter a number: ";
        }

        System.out.println(message);
        num = in.nextInt();


        return num;
    }

    private static char getCharInput(String message) {
        char c;

        if (message == "") {
            message = "Enter a character: ";
        }

        System.out.println(message);
        c = in.next().charAt(0);
        return c;
    }

    private static char getOperationInput() {
        char c = getCharInput("Enter an operation (+, -, *, /): ");
        if (c != '+' && c != '-' && c != '*' && c != '/') {
            System.out.println("Invalid operation");
            return getOperationInput();
        }
        return c;
    }

    public static int getTwoDigitNumber() {
        int num = getNumberInput("Enter a two-digit number: ");
        if (num < 10 || num > 99) {
            System.out.println("The number is not two-digit");
            return getTwoDigitNumber();
        }
        return num;
    }
}
