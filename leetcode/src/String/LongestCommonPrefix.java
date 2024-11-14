package String;

import java.util.Scanner;

// https://leetcode.com/problems/longest-common-prefix/description/?envType=problem-list-v2&envId=string
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
