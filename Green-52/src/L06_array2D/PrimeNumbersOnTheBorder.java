package L06_array2D;

import java.util.Scanner;

public class PrimeNumbersOnTheBorder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        int counter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    if (isPrime(arr[i][j])) {
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
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
