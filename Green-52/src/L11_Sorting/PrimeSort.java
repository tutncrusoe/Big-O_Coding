package L11_Sorting;

import java.util.Scanner;

public class PrimeSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrNotPrime = new int[n];
        int countNotPrime = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!isPrime(arr[i])) {
                arrNotPrime[countNotPrime] = arr[i];
                countNotPrime++;
            }
        }

        sc.close();
    }

    private static boolean isPrime(int value) {
        int count = 0;
        if (value > 1) {
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    private static void mergeSort(int[] arr, int index) {

    }
}
