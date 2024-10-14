package L05_array1D;

import java.util.Scanner;

public class NumberOfLikesOfThePost {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
