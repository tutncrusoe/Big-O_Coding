package L09_Recursion;

import java.util.Scanner;

public class HexadecimalNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        if (dec == 0) {
            System.out.println(0);
        } else {
            String str2 = "";
            char[] hex =
                    {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};

            int index = 0;
            recursion(dec, str2, index, hex);
        }
    }

    private static int recursion(int dec, String hex, int index, char[] chaz) {
        if (dec == 0) {
            System.out.println(hex);
            return index;
        }
        index = dec % 16;
        hex = chaz[index] + hex;
        return recursion(dec / 16, hex, index, chaz);
    }
}
