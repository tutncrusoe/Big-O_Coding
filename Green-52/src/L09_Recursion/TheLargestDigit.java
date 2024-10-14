package L09_Recursion;

import java.util.Scanner;

public class TheLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;

        int x = recursion(Math.abs(n), max);

        System.out.println(x);
    }

    private static int recursion(int n, int max) {
        if (n % 10 == n) {
            if (n % 10 > max) max = n ;
            return max;
        } else {
            int temp = n;
            n = temp / 10;
            if (temp - 10 * n > max) max = temp - 10 * n;
            return recursion(n, max);
        }
    }
}
