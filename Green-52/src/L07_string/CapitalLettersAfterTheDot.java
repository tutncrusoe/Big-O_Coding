package L07_string;

import java.util.Scanner;

public class CapitalLettersAfterTheDot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) != ' ' && s.charAt(i - 1) == ' ' && s.charAt(i - 2) == '.') {
                res += Character.toUpperCase(s.charAt(i));
            } else {
                res += s.charAt(i);
            }
        }
        System.out.print(res);
    }
}
