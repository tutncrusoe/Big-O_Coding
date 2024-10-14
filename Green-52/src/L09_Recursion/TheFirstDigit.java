package L09_Recursion;

import java.util.Scanner;

public class TheFirstDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0;
//        do {
//            if (n % 10 == n) {
//                x = n;
//                break;
//            }
//            n = n / 10;
//        } while (n != 0);

        x =  recursion(n, x);
        System.out.println(Math.abs(x));
    }

    private static int recursion(int n, int x) {
        if (n % 10 == n) {
            return Math.abs(n);
        } else {
            n = n / 10;
            return recursion(n, x);
        }
    }
}
