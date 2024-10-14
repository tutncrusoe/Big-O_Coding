package L09_Recursion;

import java.util.Scanner;

public class SymmetricalString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = 0;
        int end = scanner.nextInt();
        boolean isSym = true;
        scanner.nextLine();
        String string = scanner.nextLine();
        string = recursion(string, start, end / 2, isSym);
        System.out.println(string);
    }

    private static String recursion(String string, int start, int end, boolean isSym) {
        if (start == end) {
            if (isSym) return "YES";
            else return "NO";
        } else {
            if (string.charAt(string.length() - 1 - start) != string.charAt(start)) {
                return "NO";
            }
            return recursion(string, ++start, end, isSym);
        }
    }
}
