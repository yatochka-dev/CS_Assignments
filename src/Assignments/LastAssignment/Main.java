package Assignments.LastAssignment;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        task4();
    }

    private static void task1() {

        int n = in.nextInt();

        for (int x = 1; x < n; x++) {
            for (int y = 1; y < x; y++) {
                if (x * y == n) {
                    System.out.println(x + " " + y + " " + n + "\n");
                }
            }

        }

    }

    private static void task2() {

        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            String out = "";

            for (int j = 1; j <= i; j++) {
                out += j + " ";
            }
            System.out.println(out);
        }

    }

    private static void task3() {
        int n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }




    }


    private static void task4() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a = 0, b = 1, temp;
        boolean flag = number == 0 || number == 1;

        while (b < number) {
            temp = b;
            b = b + a;
            a = temp;

            if (b == number) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println(number + " is a correct number");
        } else {
            System.out.println(number + " is an incorrect number");
        }

        sc.close();


        // B. 7. Output: 7 is an incorrect number
        // C. המטרה היא לבדוק אם המספר הוא מספר פיבונאצ'י או לא, אם כן אז הוא ידפיס "{number} is a correct number" otherwise "{number} is an incorrect number"
    }


}
