package leetcode.sortcharactersbyfrequency;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int raw = nums[i] + nums[j];

                if (raw == target) {

                    int[] res = {i, j};

                    return res;
                }
            }

        }


        int[] res = {};
        return res;

    }

    public static int numSquares(int n) {
        int i = 1;
        List<Integer> squares = new ArrayList<Integer>();
        while (i * i <= n) {
            squares.add(i * i);
            i++;
        }

        System.out.println(squares);

        return 3;

    }

    public static boolean isPalindrome(int x) {
        return x >= 0 && Integer.toString(x).contentEquals(new StringBuilder(Integer.toString(x)).reverse());


    }

    public static int romanToInt(String s) {
        // hashmap for roman numerals
        int res = 0;
        java.util.Hashtable<Character, Integer> ht = new java.util.Hashtable<Character, Integer>(7, 1);
        ht.put('I', 1);
        ht.put('V', 5);
        ht.put('X', 10);
        ht.put('L', 50);
        ht.put('C', 100);
        ht.put('D', 500);
        ht.put('M', 1000);


        for (int i = 0; i < s.length(); i++) {
            // account for IV
            if (i < s.length() - 1 && ht.get(s.charAt(i)) < ht.get(s.charAt(i + 1))) {
                res -= ht.get(s.charAt(i));
            } else {
                res += ht.get(s.charAt(i));
            }

        }
        return res;
    }


    public static String longestCommonPrefix(String[] strs) {

        java.util.Hashtable<String, Integer> ht = new java.util.Hashtable<String, Integer>();
        String res = "";

        for (String str : strs) {
            String currentPrefix;
            if (str.length() < 2) currentPrefix = str;
            else currentPrefix = str.substring(0, 2);


            if (ht.containsKey(currentPrefix)) {
                ht.put(currentPrefix, ht.get(currentPrefix) + 1);
            } else {
                ht.put(currentPrefix, 1);
            }

        }

        // find the most common prefix
        int max = 0;

        for (String key : ht.keySet()) {
            if (ht.get(key) > max && (ht.get(key) > 1 || ht.get(key) == strs.length)) {
                max = ht.get(key);
                res = key;
            }
        }

        return res;

    }

    public static int getValue(char c) {
        return 0;
    }

    public static boolean isValid(String s) {
        java.util.Hashtable<Character, Integer> ht = new java.util.Hashtable<Character, Integer>(3, 1);
        ht.put('(', 0);
        ht.put('{', 0);
        ht.put('[', 0);

        for (Character bracket : s.toCharArray()) {

            if (bracket == '(') {
                ht.put('(', ht.get('(') + 1);
            } else if (bracket == '{') {
                ht.put('{', ht.get('{') + 1);
            } else if (bracket == '[') {
                ht.put('[', ht.get('[') + 1);
            } else if (bracket == ')') {
                ht.put('(', ht.get('(') - 1);
            } else if (bracket == '}') {
                ht.put('{', ht.get('{') - 1);
            } else if (bracket == ']') {
                ht.put('[', ht.get('[') - 1);
            }

        }


        return ht.get('(') == 0 && ht.get('{') == 0 && ht.get('[') == 0;

    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{""}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));

    }

}


