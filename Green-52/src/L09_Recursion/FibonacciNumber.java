package L09_Recursion;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = fibonacci(n);
        System.out.println(x);

    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
