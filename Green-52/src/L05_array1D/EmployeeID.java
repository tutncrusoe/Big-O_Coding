package L05_array1D;

import java.util.Scanner;

public class EmployeeID {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        boolean passFirst = false;
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (!passFirst) {
                passFirst = true;
                min = arr[0];
                max = arr[0];
            }
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

//        System.out.println("min: " + min + " - max: " + max);
        for (int count = 1; count < max + 1; count++) {
            boolean flag = check(count, arr);
//            System.out.println("flag: " + flag);
            if (!flag) {
                System.out.println(count);
                break;
            }
            if (count == max) {
                System.out.println(max + 1);
            }
        }
    }

    private static boolean check(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
//                System.out.println("break: arr[i] == x == " + x);
                return true;
            }
        }
        return false;
    }
}
