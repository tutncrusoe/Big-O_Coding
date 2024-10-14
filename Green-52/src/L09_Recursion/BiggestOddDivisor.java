package L09_Recursion;

import java.util.Scanner;

public class BiggestOddDivisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = biggestOddDivisor(n);
        System.out.println(x);
    }

    private static int biggestOddDivisor(int number){
        if (number % 2 ==  0){
            return biggestOddDivisor(number / 2);
        } else {
            return number;
        }
    }
}
