package L07_string;

import java.util.Scanner;

public class CheckCharactersAppearance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flagB = false;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'b') {
                flagB = true;
                break;
            } else if (Character.toLowerCase(s.charAt(i)) == 'i') {
                flagB = true;
                break;
            } else if (Character.toLowerCase(s.charAt(i)) == 'g') {
                flagB = true;
                break;
            } else if (Character.toLowerCase(s.charAt(i)) == 'o') {
                flagB = true;
                break;
            }
        }
        if (flagB) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}