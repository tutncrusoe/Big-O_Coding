package L09_Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = (int) factorial(n);
        System.out.println(result);
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n == 1 ? 1 : n * factorial(n - 1);
        }
    }
}
