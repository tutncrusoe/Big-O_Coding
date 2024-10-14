package L13_Reviews;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = 0;
        int end = sc.nextInt();
        sc.nextLine();
        String string = sc.nextLine();
        boolean isPalindrome = true;
        String str = recursion(string, start, end / 2, isPalindrome);
        System.out.println(str);
    }

    private static String recursion(String str, int start, int end, boolean isPalindrome) {
        if (start == end) {
            if (isPalindrome) {
                return "YES";
            } else {
                return "NO";
            }
        } else {
            if (str.charAt(str.length() - 1 - start) != str.charAt(start)) {
                return "NO";
            }
            return recursion(str, ++start, end, isPalindrome);
        }
    }
}
