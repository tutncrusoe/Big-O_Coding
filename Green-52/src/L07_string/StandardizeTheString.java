package L07_string;

import java.util.Scanner;

public class StandardizeTheString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            if (i > 1 && s.charAt(i - 1) == ' ' && s.charAt(i) != ' ') {
                if (!first) {
                    System.out.print(' ');
                }
                System.out.print(s.charAt(i));
//                System.out.println(2);
                first = false;
            } else if (s.charAt(i) != ' ') {
                System.out.print(s.charAt(i));
//                System.out.println(1);
                first = false;
            }
        }
    }
}
