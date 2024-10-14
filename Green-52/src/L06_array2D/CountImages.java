package L06_array2D;

import java.util.Scanner;

public class CountImages {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;

        int[][] image = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = sc.nextInt();
                if (image[i][j] > 100) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
