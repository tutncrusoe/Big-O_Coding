package L06_array2D;

import java.util.Scanner;

public class PrimeNumbersOnTheMainDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                if (i == j) {
                    boolean flag = isPrime(arr[i][j]);
                    if (flag) count++;
                }
            }
        }
        System.out.println(count);
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
