package leetcode.sortcharactersbyfrequency;

import java.util.Hashtable;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        long start = System.currentTimeMillis();
        System.out.println(s.frequencySort("awdawdawdaddddddddddddddd"));
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start));
    }

    public String frequencySort(String s) {
        // Sort characters by frequency
        s = "dwadawdawdjhbm,nfvbmnddawdawwwwwwwwwwwwwwwwwwww";

        String res = "";
        StringBuilder sb = new StringBuilder(s);
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {

            if (ht.containsKey(s.charAt(i))) {
                ht.put(s.charAt(i), ht.get(s.charAt(i)) + 1);
            } else {
                ht.put(s.charAt(i), 1);
            }
        }

        while (ht.size() > 0) {
            int max = 0;
            char maxChar = ' ';
            for (char key : ht.keySet()) {
                if (ht.get(key) > max) {
                    max = ht.get(key);
                    maxChar = key;
                }
            }
            for (int i = 0; i < max; i++) {
                res += maxChar;
            }
            ht.remove(maxChar);
        }


        return res;
    }
}