package L07_string;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String reverse = "";
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                reverse = str.substring(start, i + 1) + reverse;
                start = i + 1;
            }
            if (i == str.length() - 1) {
                reverse = str.substring(start, str.length()) + " " + reverse;
            }
        }
        System.out.println(reverse);
    }
}
