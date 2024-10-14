package L05_array1D;

import java.util.Scanner;

public class ListDivisibleBy2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
