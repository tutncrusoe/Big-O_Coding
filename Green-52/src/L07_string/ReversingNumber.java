package L07_string;

import java.util.Scanner;

public class ReversingNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();

        int i;
        int j = string.length() - 1;
        String newStringLast = "";
        String newStringFirst = "";
        for (i = 0; i <= j; ) {
            newStringLast = string.charAt(i) + newStringLast;
            if (i != j) {
                newStringFirst = newStringFirst + string.charAt(j);
            }
            i++;
            j--;
        }
        System.out.println(newStringFirst + newStringLast);
    }
}
