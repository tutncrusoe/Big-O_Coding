package L11_Sorting;

import java.util.Scanner;

public class Median {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            insertionSort(arr, i, arr[i]);
        }

        if (n % 2 == 0) {
            System.out.println((float) (arr[n / 2 - 1] + arr[n / 2]) / 2);
        } else {
            System.out.println(arr[n / 2]);
        }
        sc.close();
    }

    private static void insertionSort(int[] arr, int index, int value) {
        int j = index;
        while (j > 0) {
            if (arr[j - 1] < value) {
                arr[j] = value;
                break;
            } else {
                arr[j] = arr[j - 1];
                arr[j - 1] = value;
            }
            j--;
        }
    }
}
