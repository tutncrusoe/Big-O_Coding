package L07_string;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String diff = "";
        for (int i = 0; i < string.length(); i++) {
            boolean flag = checkExist(string.charAt(i), diff);
            if (!flag) {
                diff += string.charAt(i);
            }
        }

        int count = 0;
        for (int i = 0; i < diff.length(); i++) {
            count++;
        }
        System.out.println(count);
    }

    private static boolean checkExist(char ch, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
