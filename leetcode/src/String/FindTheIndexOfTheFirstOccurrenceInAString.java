package String;

import java.util.Scanner;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {

        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
