package L09_Recursion;

import java.util.Scanner;

public class TheNumberOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;
//        do {
//            if (n / 10 == 0) {
//                break;
//            }
//            n = n / 10;
//            count++;
//        } while (n != 0);

        count = recursion(n, count);

        System.out.println(count);
    }

    private static int recursion(int n, int count) {
        if (n / 10 == 0) {
            return count;
        } else {
            return recursion(n / 10, count + 1);
        }
    }
}
