package L06_array2D;

import java.util.Scanner;

public class ColumnOfNegativeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
//                System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            boolean positive = false;
            for (int j = 0; j < m; j++) {
//                System.out.println("m: " + j + "; n: " + i);
//                System.out.println("arr[" + j + "][" + i + "]: " + arr[j][i]);
                if (arr[j][i] > 0) {
                    positive = true;
//                    System.out.println(positive);
                }
            }
//            System.out.println("positive: " + positive);
            if (!positive) {
                System.out.print(i + " ");
            }
        }

    }
}
