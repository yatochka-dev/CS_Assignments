package livework.two;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int one, two, three, res;
        res = 0;

        one = in.nextInt();
        two = in.nextInt();
        three = in.nextInt();

        int[] ints = {one, two, three};

        for (int i : ints) {
            for (int j : ints) {

                if (i == j) res++;


            }
        }


        System.out.println(res);
    }
}
