

public class LockCodeChecker {

    public static void main(String[] args) {
        //        System.out.print("Enter a 4-digit number (1000-9999): ");
        //        int userNumber = inputNumber();
        // run through 1000-9999

        int maxDiff = 0;
        int maxDiffNum = 0;
        for (int i = 1000; i < 10000; i++) {

            if (run(i)) {
                System.out.println(i);
                // last biggest diff
                int diff = maxOfFour(i) - minOfFour(i);
                if (diff > maxDiff) {
                    maxDiff = diff;
                    maxDiffNum = i;
                }


            }
        }


        System.out.println(
                "The number with the biggest difference between the largest and smallest digits is: " + maxDiffNum
        );


    }


    public static boolean run(int userNumber) {


        int thousands = (userNumber / 1000) % 10;
        int hundreds = (userNumber / 100) % 10;
        int tens = (userNumber / 10) % 10;
        int units = userNumber % 10;

        int evenDigitSum = sumOfEvenDigits(thousands, hundreds, tens, units);
        int firstLastSum = thousands + units;

        // difference between thousands and hundreds is more than 6 + difference between thousands and tens is more than 6;
        int diffTH = thousands - hundreds;
        int diffTT = thousands - tens;

        boolean checkDiffTH = turnPositive(diffTH) > 6;
        boolean checkDiffTT = turnPositive(diffTT) > 6;


        return (evenDigitSum <= 8) && (firstLastSum <= 3) && checkDiffTH && checkDiffTT;
    }

    private static int turnPositive(int num) {
        return num < 0 ? -num : num;
    }

    private static int sumOfEvenDigits(int... digits) {
        int sum = 0;
        for (int digit : digits) {
            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }

    private static int maxOfFour(int userNumber) {
        int a = (userNumber / 1000) % 10;
        int b = (userNumber / 100) % 10;
        int c = (userNumber / 10) % 10;
        int d = userNumber % 10;
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    private static int minOfFour(int userNumber) {
        int a = (userNumber / 1000) % 10;
        int b = (userNumber / 100) % 10;
        int c = (userNumber / 10) % 10;
        int d = userNumber % 10;
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
