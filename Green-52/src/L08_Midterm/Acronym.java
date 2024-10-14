package L08_Midterm;

import java.util.Scanner;

public class Acronym {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                out += Character.toUpperCase(s.charAt(i));
            }

            if (i > 0 && s.charAt(i - 1) == ' ') {
                out += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(out);
    }
}
