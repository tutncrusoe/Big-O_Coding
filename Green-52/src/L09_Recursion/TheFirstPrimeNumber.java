package L09_Recursion;

import java.util.Scanner;

public class TheFirstPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = -1;
        index = primes(arr, arr.length - 1, index);
        System.out.println(index);
    }

    private static int primes(int[] arr, int n, int index) {
        if (n < 0) {
            return index;
        }
        if (isPrime(arr[n])) {
            index = n;
        }
        return primes(arr, n - 1, index);
    }

    private static boolean isPrime(int x) {
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
