package Homework1;

import java.util.*;

// I named classes after Assignment's number

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Sixth.main(args, in);
        Eighth.main(args, in);
        Ninth.main(args, in);

        // Closing the scanner
        in.close();

        System.out.println("Scanner been terminated.");
    }
}

class Sixth {



    public static void main(String[] args, Scanner in) { // NOQA
        // eliminatedInFirstTour is an integer because, it will automatically round up the number of eliminated players.
        int playerCount, eliminatedInFirstTour, eliminatedInSecondTour;

        System.out.print("Enter player count: ");
        playerCount = in.nextInt();

        eliminatedInFirstTour = playerCount / 7;
        System.out.println("Players eliminated in first tour: " + eliminatedInFirstTour);
        playerCount = playerCount - eliminatedInFirstTour;
        eliminatedInSecondTour = playerCount / 7;
        playerCount = playerCount - eliminatedInSecondTour;

        System.out.println("Players left after the second tour: " + playerCount);
    }
}

class Eighth {

   public static void main(String[] args, Scanner in) { // NOQA
        System.out.println("Enter a two digit number 11 - 99");

        int number = in.nextInt();
        if (number >= 11 && number <= 99) {
            int tens = number / 10;
            int ones = number % 10;

            // Making a 3-digit number
            int result = Integer.parseInt("" + ones + tens + ones);

            System.out.println(result);


        } else {
            System.out.println("Error: The number isn't two digit");
        }

    }
}

class Ninth {



   public static void main(String[] args, Scanner in) { // NOQA
        int daysIn, years, months, weeks, daysOut, remainingDays;

        System.out.println("Enter amount of days: ");
        daysIn = in.nextInt();

        // Calculations
        years = daysIn / 365;
        remainingDays = daysIn % 365;
        months = remainingDays / 30;
        remainingDays = remainingDays % 30;
        weeks = remainingDays / 7;
        remainingDays = remainingDays % 7;
        daysOut = remainingDays;


        System.out.println("Output: " + years + " years, " + months + " months, " + weeks + " weeks, " + daysOut + " days");
    }
}