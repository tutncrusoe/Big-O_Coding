package L16_Final;

import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
            insertionSort(arr1, i, arr1[i]);
        }

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            insertionSort(arr2, i, arr2[i]);
        }

        int[] arr = new int[m + n];
        mergeSort(arr, arr1, arr2);

        System.out.println(arr[k]);
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

    private static void mergeSort(int[] arr, int[] arr1, int[] arr2) {
        int m = 0, n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m < arr1.length && n < arr2.length) {
                if (arr1[m] < arr2[n]) {
                    arr[i] = arr1[m];
                    m++;
                } else if (arr1[m] > arr2[n]) {
                    arr[i] = arr2[n];
                    n++;
                } else {
                    if (arr1.length - m > arr2.length - n) {
                        arr[i] = arr1[m];
                        m++;
                    } else {
                        arr[i] = arr2[n];
                        n++;
                    }
                }
            } else {
                if (m == arr1.length) {
                    arr[i] = arr2[n];
                    n++;
                } else if (n == arr2.length) {
                    arr[i] = arr1[m];
                    m++;
                }
            }
        }
    }
}

