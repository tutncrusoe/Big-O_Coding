package L11_Sorting;

import java.util.Scanner;

public class SortInDescendingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int value = arr[i];
            insertSortDesc(arr, i, value);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertSortDesc(int[] arr, int index, int value) {
        int j = index;
        while (j > 0) {
            if (arr[j - 1] >= value) {
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
