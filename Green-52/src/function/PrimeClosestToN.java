package function;

import java.util.*;

public class PrimeClosestToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (checkPrime(n)) {
            System.out.println(n);
        } else {
            for (int i = 1; i < n; i++) {
                if (checkPrime(n - i)) {
                    System.out.println(n - i);
                    break;
                }
                if (checkPrime(n + i)) {
                    if (checkPrime(n - i)) {
                        System.out.println(n - i);
                        break;
                    }
                    System.out.println(n + i);
                    break;
                }
            }
        }
    }

    private static boolean checkPrime(int m) {
        int count = 0;
        if (m > 1) {
            for (int i = 1; i <= m; i++) {
                if (m % i == 0) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}