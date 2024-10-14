package L06_array2D;

import java.util.Scanner;

public class ProductOfPrimesOnSecondaryDiagonal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (j == n - i - 1) {
                    boolean flag = isPrime(arr[i][j]);
                    if (flag) {
                        product = product * arr[i][j] % 1000003;
                    }
                }
            }
        }
        System.out.println(product);
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
