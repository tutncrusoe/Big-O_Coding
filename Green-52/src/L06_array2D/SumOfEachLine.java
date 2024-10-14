package L06_array2D;

import java.util.Scanner;

public class SumOfEachLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            System.out.println(i + ": " + sum);
        }
    }
}
