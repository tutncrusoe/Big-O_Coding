package L06_array2D;

import java.util.Arrays;
import java.util.Scanner;

public class RowWithMostEvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[] counter = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] % 2 == 0) {
                    counter[i]++;
                }
            }
        }
//        System.out.println(Arrays.toString(counter));
        int max = counter[0];
        int row = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > max) {
                max = counter[i];
                row = i;
//                System.out.println(row);
            }
        }
        System.out.println(row);
    }
}
