package L06_array2D;

import java.util.Scanner;

public class CreateMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        boolean aFlag = true;
        boolean bFlag = true;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = a;
                    System.out.print(a + " ");
                    aFlag = false;
                } else if (i == 0 && j == 1) {
                    matrix[i][j] = b;
                    System.out.print(b + " ");
                    aFlag = true;
                    bFlag = false;
                } else if (aFlag) {
                    matrix[i][j] = (a + b) % p;
                    a = matrix[i][j];
                    System.out.print(a + " ");
                    aFlag = false;
                    bFlag = true;
                } else if (bFlag) {
                    matrix[i][j] = (a + b) % p;
                    b = matrix[i][j];
                    System.out.print(b + " ");
                    aFlag = true;
                    bFlag = false;
                }
            }
            System.out.println();
        }
    }
}
