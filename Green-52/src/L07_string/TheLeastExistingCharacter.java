package L07_string;

import java.util.Scanner;

public class TheLeastExistingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = sc.nextLine();
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            char chaz = (char) getMin(string);
            System.out.println(chaz);
        }

    }

    private static int position(char chaz) {
        if ('A' <= chaz && chaz <= 'Z') {
            return (int) chaz - (int) 'A';
        }
        return (int) chaz - (int) 'a';
    }

    private static int getMin(String string) {
        int[] count = new int[26];
        for (int j = 0; j < count.length - 1; j++) {
            count[j] = 0;
        }
        for (int i = 0; i < string.length(); i++) {
            count[position(string.charAt(i))]++;
        }

        int min = 1000;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0 && count[i] < min) {
                min = count[i];
                index = i + (int) 'A';
            }
        }
        return index;
    }
}
