package L09_Recursion;

import java.util.Scanner;

public class SumOfEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfEven(arr, n - 1, sum);
    }

    static void sumOfEven(int[] arr, int i, int sum) {
        if ((arr[i]) % 2 == 0) {
            sum += (arr[i]);
        }
        if (i == 0) {
            System.out.print(sum);
            return;
        }
        sumOfEven(arr, i - 1, sum);
    }
}
