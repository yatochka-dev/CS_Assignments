// Java CheatSheet
package Homework10;

import java.util.Scanner;

public class Main {

    public static void random() {
        // Random number generator
        // Random rand = new Random();
        // int first = rand.nextInt(6 - 1 + 1) + 1;
        // Number 1-6
        // int second = rand.nextInt(6 - 1 + 1) + 1;
        // Number 2-9
        // int gen = rand.nextInt(9 - 2 + 1) + 2;
        // template for number generation
        // int gen = rand.nextInt(max - min + 1) + min;
    }

    public static void whileLoop() {
        // while loop
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }
    }

    public static void allMathMethodsAndExamples() {
        // Math.abs()
        // Math.abs(-1); // 1
        // Math.round()
        // Math.round(1.5); // 2
        // Math.ceil()
        // Math.ceil(1.1); // 2.0
        // Math.floor()
        // Math.floor(1.9); // 1.0
        // Math.pow()
        // Math.pow(2, 3); // 8.0
        // Math.sqrt()
        // Math.sqrt(9); // 3.0
        // Math.cbrt()
        // Math.cbrt(27); // 3.0
        // Math.max()
        // Math.max(1, 2); // 2
        // Math.min()
        // Math.min(1, 2); // 1
        // Math.random()
        // Math.random(); // 0.0 - 1.0
        // Math.sin()
        // Math.sin(0); // 0.0
        // Math.cos()
        // Math.cos(0); // 1.0
        // Math.tan()
        // Math.tan(0); // 0.0
        // Math.asin()
        // Math.asin(0); // 0.0
        // Math.acos()
        // Math.acos(1); // 0.0
        // Math.atan()
        // Math.atan(0); // 0.0
        // Math.toDegrees()
        // Math.toDegrees(Math.PI); // 180.0
        // Math.toRadians()
        // Math.toRadians(180); // 3.141592653589793
        // Math.log()
        // Math.log(1); // 0.0
        // Math.log10()
        // Math.log10(1); // 0.0
        // Math.exp()
        // Math.exp(0); // 1.0
        // Math.floorMod()
        // Math.floorMod(1, 2); // 1
        // Math.floorDiv()
        // Math.floorDiv(1, 2); // 0
        // Math.incrementExact()
        // Math.incrementExact(1); // 2
        // Math.decrementExact()
        // Math.decrementExact(1); // 0
        // Math.negateExact()
        // Math.negateExact(1); // -1
        // Math.addExact()
        // Math.addExact(1, 2); // 3
        // Math.subtractExact()
        // Math.subtractExact(1, 2); // -1
        // Math.multiplyExact()
        // Math.multiplyExact(1, 2); // 2
        // Math.toIntExact()
        // Math.toIntExact(1); // 1
        // Math.floorMod()
        // Math.floorMod(1, 2); // 1
        // Math.floorDiv()
        // Math.floorDiv(1, 2); // 0
    }

    public static void Variables() {
        // Variables
        // int a = 1;
        // double b = 1.0;
        // char c = 'a';
        // String d = "Hello";
        // boolean e = true;
        // final int f = 1;
        // final double g = 1.0;
        // final char h = 'a';
        // final String i = "Hello";
        // final boolean j = true;
    }

    public static void ifElse() {
        // if else
        // int a = 1;
        // if (a == 1) {
        //     System.out.println("a is 1");
        // } else if (a == 2) {
        //     System.out.println("a is 2");
        // } else {
        //     System.out.println("a is not 1 or 2");
        // }
    }

    public static void switchCase() {
        // switch case
        // int a = 1;
        // switch (a) {
        //     case 1:
        //         System.out.println("a is 1");
        //         break;
        //     case 2:
        //         System.out.println("a is 2");
        //         break;
        //     default:
        //         System.out.println("a is not 1 or 2");
        //         break;
        // }

        // What break does?
        // break; // exit the switch case
    }

    public static void forLoop() {
        // for loop
        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }
    }

    public static void doWhileLoop() {

//         int i = 0;
//         do {
//             System.out.println(i);
//             i++;
//         } while (i < 10);
    }

    // "hello".charAt(0)

    public static void StringFunctions() {

        // String Functions
        // "hello".length(); // 5
        // "hello".charAt(0); // 'h'
        // "hello".equals("hello"); // true
        // "hello".equalsIgnoreCase("HELLO"); // true
        // "hello".startsWith("he"); // true
        // "hello".endsWith("lo"); // true
        // "hello".substring(0, 2); // "he"
        // "hello".toLowerCase(); // "hello"
        // "hello".toUpperCase(); // "HELLO"
        // "hello".replace("h", "j"); // "jello"
        // "hello".indexOf("l"); // 2

    }

    public static void task32() {
//        String name = "Philip";
//        char firstLetter = name.toLowerCase().charAt(0); // 'p'
//
//        String message = new Scanner(System.in).next();
//        int index = message.indexOf(firstLetter);
//
//        if (index == -1) {
//            System.out.println("The first letter of your name is not in the message.");
//        } else {
//            System.out.println("The first letter of your name is in the message."  + index+1);
//        }
        String name = "Philip";
        char firstLetter = name.toLowerCase().charAt(0); // 'p'

        Scanner scanner = new Scanner(System.in);

        String message = scanner.next();

        int index = -1;

        for (int i = message.length() - 1; i != 0; i--) {
            char Character = message.charAt(i);

            if (Character == firstLetter) {
                index = i;
            }
        }

        System.out.println(index);


    }

    public static void task36() {
        int lengthOfTheLongestSequence = 0;
        int currentSequence = 1;
        int last = 0;

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        while (input > 0) {
            if (currentSequence > lengthOfTheLongestSequence) {
                lengthOfTheLongestSequence = currentSequence;
            }

            if (input > last) {
                currentSequence++;
            } else {
                currentSequence = 0;
            }


            last = input;
            input = in.nextInt();
        }


        System.out.println(lengthOfTheLongestSequence);

    }

    public static void task34() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), digit = in.nextInt();

        boolean containsDigit = false;
        int numberCopy = number;
        while (numberCopy > 0) {
            if (numberCopy % 10 == digit) {
                containsDigit = true;
                break;
            }
            numberCopy /= 10;
        }

        float result = (float) number;
        if (!containsDigit) {
            result += (float) digit / 10;
        }

        System.out.println(result);

    }

    public static void task35() {
        Scanner in = new Scanner(System.in);

        int inputLeft = in.nextInt();
        int inputRight = in.nextInt();
        int count = 0;

        while (
                (inputLeft > 9 && inputLeft < 100)
                        && (inputRight > 9 && inputRight < 100)
        ) {


            if (isSimilar(inputLeft, inputRight)) {
                count++;
                System.out.printf("%d and %d are similar!\n", inputLeft, inputRight);
            } else {
                System.out.printf("%d and %d are not similar!\n", inputLeft, inputRight);

            }

            inputLeft = in.nextInt();
            inputRight = in.nextInt();
        }

        System.out.printf("Count is %d.\n", count);
    }

    public static Boolean isSimilar(Integer _n, Integer _n2) {

        int n11 = _n / 10, n12 = _n % 10, n21 = _n2 / 10, n22 = _n2 % 10;


        return (n11 == n21 && n12 == n22) || (n11 == n22 && n12 == n21);
    }

    public static void task55() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int current = in.nextInt();
        int last = 0;
        int smallestDiff = 0;
        int smallestDiffOne = 0, smallestDiffTwo = 0;
        int middle = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(i);


            if (i == n / 2 + 1) {
                middle = current;
            }


            last = current;
            current = in.nextInt();

            if (i == 1) {
                smallestDiff = current - last;
                smallestDiffOne = last;
                smallestDiffTwo = current;
            }


            if (smallestDiff > current - last) {
                smallestDiff = current - last;
                smallestDiffOne = last;
                smallestDiffTwo = current;
            }


            sum += current;
        }
        System.out.println(sum);

        System.out.printf("The average is: %f.\n", (float) sum / n);
        System.out.printf("The smallest diff pair is %d and %d with diff of %d.\n", smallestDiffOne, smallestDiffTwo, smallestDiff);
        System.out.printf("The middle number is %d.", middle);

    }

    public static void task52() {
        int sum = 0;
        for (int i = 1000; i <= 9999; i++) {
            if (i / 100 == i % 100) {
                sum++;
                System.out.println(i);
            }
        }


        System.out.println(sum);

    }

    public static void task53() {
        Scanner in = new Scanner(System.in);
        int count = 5;
        int countOfLessThan4Min = 0;
        String currentPlate = in.next();
        int time = in.nextInt();
        int totalTime = 0;

        for (int i = 1; i < count; i++) {

            if (time < 240) {
                countOfLessThan4Min++;
                System.out.printf("The car with plate %s came in less than 4 minutes!\n", currentPlate);
            }

            if (time > 300) {
                System.out.printf("Car with plate number %s will not proceed to the next race.\n", currentPlate);
            }

            totalTime += time;
            currentPlate = in.next();
            time = in.nextInt();
        }

        System.out.printf("Average time is %f.\n",  (float) totalTime / count);
        System.out.printf("%d cars came in less than 4 minutes!\n", countOfLessThan4Min);
    }


    public static void main(String[] args) {
////        task36();
//        char h = '5';
//
//        int hN = Integer.parseInt(String.valueOf(h));
//        System.out.println(hN);
        task53();
    }


}
