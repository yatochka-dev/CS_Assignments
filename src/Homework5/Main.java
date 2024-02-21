package Homework5;

import java.util.*;

public class Main {
    public static List<String> genders = new ArrayList<String>();

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        genders.add("Male");
        genders.add("Female");
        genders.add("Croissant");
//        task36();
//        task37();
//        task40();
//        task41();
//        task43();
//        task44();
    }


    public static void task36() {

        int first, second;
        first = inputNumber();
        second = inputNumber();

        if (first == second) {
            System.out.println("They are equal. " + first + second);
        } else if (first > second) {
            System.out.println("First is larger than the second " + first + second);
        } else {
            System.out.println("Second is larger than the first " + second + first);
        }
    }

    public static void task37() {
        int balance;

        balance = inputNumber();

        if (balance == 0) {
            System.out.println("Your balance is zero 🥲");
        } else if (balance > 0) {
            System.out.println("You have money 😀 " + balance);
        } else {
            System.out.println("We know where you live 😁, you owe us: " + balance);
        }

    }

    public static void task40() {

        int psychometric, test;

        psychometric = inputNumber();
        test = inputNumber();

        boolean testValid = test >= 90;
        boolean psychoValid = psychometric >= 600;

        if (testValid && psychoValid) {
            System.out.println("You pass 😁");
        } else if (!testValid && psychoValid) {
            System.out.println("You need to improve on the test");
        } else if (testValid) {
            System.out.println("You need to improve on the psychometric test");
        } else {
            System.out.println("You don't pass!");
        }

    }

    public static void task41() {

        int age1, age2;
        String gender1, gender2;

        System.out.println("Enter first competitors age");
        age1 = in.nextInt();
        gender1 = inputGender("first");

        System.out.println("Enter second competitors age");
        age2 = in.nextInt();
        gender2 = inputGender("second");

        String group1 = getAgeGroup(age1);
        String group2 = getAgeGroup(age2);

        System.out.println("Player A: " + group1 + " " + gender1 + " " + age1);
        System.out.println("Player B: " + group2 + " " + gender2 + " " + age2);

        if (gender1.equals(gender2) && group1.equals(group2)) {
            System.out.println("They can compete");
        } else {
            System.out.println("They can't compete!");
        }

    }

    public static void task43() {

        int zela1, zela2, zela3;

        zela1 = inputNumber();
        zela2 = inputNumber();
        zela3 = inputNumber();

        boolean allSidesEqual = zela1 == zela2 && zela2 == zela3;
        boolean noSidesEqual = zela1 != zela2 && zela2 != zela3 && zela1 != zela3;
        boolean twoSidesEqual = zela1 == zela2 || zela2 == zela3 || zela1 == zela3; // NOQA


        if (allSidesEqual) {
            System.out.println("All sides of the triangle are equal");
        } else if (noSidesEqual) {
            System.out.println("No sides of the triangle are equal");
        } else {
            System.out.println("Two sides of the triangle are equal");
        }

    }

    public static void task44() {
        Hashtable<String, Integer> scores = new Hashtable<>();

        System.out.println("Enter Niv's score:");
        scores.put("Niv", in.nextInt());
        System.out.println("Enter Dana's score:");
        scores.put("Dana", in.nextInt());
        System.out.println("Enter Naama's score:");
        scores.put("Naama", in.nextInt());

        String firstPlace;
        String secondPlace;
        String thirdPlace;

        if (scores.get("Niv") > scores.get("Dana") && scores.get("Niv") > scores.get("Naama")) {
            firstPlace = "Niv";
            if (scores.get("Dana") > scores.get("Naama")) {
                secondPlace = "Dana";
                thirdPlace = "Naama";
            } else {
                secondPlace = "Naama";
                thirdPlace = "Dana";
            }
        } else if (scores.get("Dana") > scores.get("Niv") && scores.get("Dana") > scores.get("Naama")) {
            firstPlace = "Dana";
            if (scores.get("Niv") > scores.get("Naama")) {
                secondPlace = "Niv";
                thirdPlace = "Naama";
            } else {
                secondPlace = "Naama";
                thirdPlace = "Niv";
            }
        } else {
            firstPlace = "Naama";
            if (scores.get("Niv") > scores.get("Dana")) {
                secondPlace = "Niv";
                thirdPlace = "Dana";
            } else {
                secondPlace = "Dana";
                thirdPlace = "Niv";
            }
        }

        System.out.println("Election Results:");
        System.out.println("1st Place: " + firstPlace + " with " + scores.get(firstPlace) + " points");
        System.out.println("2nd Place: " + secondPlace + " with " + scores.get(secondPlace) + " points");
        System.out.println("3rd Place: " + thirdPlace + " with " + scores.get(thirdPlace) + " points");

        // IT COULD HAVE LOOKED LIKE THIS:
        //        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(scores.entrySet());
        //        sortedScores.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //        System.out.println("Election Results:");
        //        System.out.println("1st Place: " + sortedScores.get(0).getKey() + " with " + sortedScores.get(0).getValue() + " points");
        //        System.out.println("2nd Place: " + sortedScores.get(1).getKey() + " with " + sortedScores.get(1).getValue() + " points");
        //        System.out.println("3rd Place: " + sortedScores.get(2).getKey() + " with " + sortedScores.get(2).getValue() + " points");


    }

    public static String inputGender(String competitor) {

        System.out.println("Enter" + " " + competitor + " " + "competitors gender");
        String gender = in.next();

        if (!genders.contains(gender)) throw new Error("Gender that doesn't exist has been entered!");
        return gender;
    }

    public static String getAgeGroup(int age) {

        if (age < 8) return "A";
        else if (age > 8 && age < 13) return "B";
        else if (age > 13 && age < 17) return "C";
        else return "";

    }

    public static int inputNumber() {
        System.out.println("Enter a number: ");
        return in.nextInt();
    }
}
