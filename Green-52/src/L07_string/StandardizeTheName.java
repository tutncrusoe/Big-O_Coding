package L07_string;

import java.util.Scanner;

public class StandardizeTheName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String res = "";
            for (int j = 0; j < s.length(); j++) {
                if (j == 0 || s.charAt(j - 1) == ' ') {
                    res += s.substring(j, j + 1).toUpperCase();
                } else if (s.charAt(j) != ' ') {
                    res += s.substring(j, j + 1).toLowerCase();
                } else if (s.charAt(j) == ' ') {
                    res += s.charAt(j);
                }
            }
            System.out.println(res);
        }
    }
}
