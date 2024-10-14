package L09_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binary = new int[40];
        int index = 0;
        int length = recursion(n, binary, index);
        if (length == 0) System.out.println(0);
        else {
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(binary[i]);
            }
        }
    }

    private static int recursion(int dec, int[] binary, int index) {
        if (dec == 0) return index;
        else {
            binary[index++] = dec % 2;
            return recursion(dec / 2, binary, index);
        }
    }
}
