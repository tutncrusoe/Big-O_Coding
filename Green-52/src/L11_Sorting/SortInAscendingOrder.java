package L11_Sorting;

import java.util.Scanner;

public class SortInAscendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            insertAsc(arr, i, value);
        }
    }

    private static void insertAsc(int[] arr, int i, int value) {
        int j = i;
        while (j > 0) {
            if (arr[j - 1] <= value) {
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
