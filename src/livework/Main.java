package livework;

import java.util.*;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

// The variable "num" holds an integer user input
// Write a conditional statement starting on line 9 that does the following:
//
//-  If num is positive, print "__ is positive"
//-  if num is negative, print "__ is negative"
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        if (num < 0)
            System.out.println(num + "is negative");
        else {
            System.out.println(num + "is positive");
        }

    }

}