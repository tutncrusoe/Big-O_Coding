package L05_array1D;

import java.util.Scanner;

public class ManageLALA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean isGood = true;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr[arr.length - 1] == 0) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                if (i > 3 &&
                        arr[i - 1] == 0 &&
                        arr[i - 2] == 0 &&
                        arr[i - 3] == 0 &&
                        arr[i - 4] == 0) {
                    isGood = false;
                }
            }
            if (isGood) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}