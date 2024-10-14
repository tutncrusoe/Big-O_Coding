package L08_Midterm;

import java.util.Scanner;

public class TaxiFare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int money = 0;
        if (n == 1) {
            money = 15000;
        } else if (2 <= n && n <= 5) {
            money = 15000 + (n - 1) * 13500;
        } else if (6 <= n && n <= 11) {
            money = 15000 + 4 * 13500 + (n - 5) * 11000;
        } else if (12 <= n) {
            money = 15000 + 4 * 13500 + (n - 5) * 11000;
            money = money - (int) (money * 0.1);
        }
        System.out.println(money);
    }
}
