package L08_Midterm;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            for (int j = 1; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
