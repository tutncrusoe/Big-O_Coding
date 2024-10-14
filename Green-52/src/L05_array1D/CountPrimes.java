package L05_array1D;

import java.util.Scanner;

public class CountPrimes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] primes = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            primes[i] = in.nextInt();
            if (checkPrimes(primes[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkPrimes(int x) {
        int count = 0;
        if (x > 1) {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
        }
        return count == 2;
    }
}


