package L08_Midterm;

import java.util.Scanner;

public class Magnet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (i > 0 && array[i] != array[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
