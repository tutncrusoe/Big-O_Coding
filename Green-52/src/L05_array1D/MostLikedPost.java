package L05_array1D;

import java.util.Scanner;

public class MostLikedPost {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}