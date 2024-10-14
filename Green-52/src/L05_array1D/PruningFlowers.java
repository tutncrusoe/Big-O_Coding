package L05_array1D;

import java.util.Scanner;

public class PruningFlowers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] flowers = new int[n];
        boolean passFirst = false;
        int min = 0;
        for (int i = 0; i < n; i++) {
            flowers[i] = in.nextInt();
            if (!passFirst) {
                passFirst = true;
                min = flowers[0];
            }
            if (passFirst && flowers[i] < min) {
                min = flowers[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += flowers[i] - min;
        }
        System.out.println(sum);
    }
}
