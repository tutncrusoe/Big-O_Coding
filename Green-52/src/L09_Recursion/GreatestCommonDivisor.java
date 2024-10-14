package L09_Recursion;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(recursion(a, b));
    }

    private static int recursion(int a, int b) {
        if (b == 0) return a;
        return recursion(b, a % b);
    }
}
