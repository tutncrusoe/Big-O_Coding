package function;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int count = 1;
        while (temp >= 10) {
            count++;
            temp = temp / 10;
        }
//        System.out.println("count: " + count);


        boolean symFlag = true;
        int j = count;
        for (int i = 1; i <= j; i++) {
            symFlag = isPalindrome(j, i, n);
            if (!symFlag) {
                break;
            }
            j--;
        }

        if (symFlag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPalindrome(int end, int first, int n) {
//        System.out.println("end: " + end);
//        System.out.println("first: " + first);
//        System.out.println("n: " + n);
        int x = -1, y = -2;
        int temp = n;
        int count = 0;
        do {
            count++;
            if (count == first) {
                y = temp % 10;
//                System.out.println("y = " + y);
            }
            if (count == end) {
                x = temp % 10;
//                System.out.println("x = " + x);
                break;
            }
            temp /= 10;
        } while (count < end);
        if (x == y) return true;
        return false;
    }
}
