package L05_array1D;

import java.util.Scanner;

public class Fruits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] apple = new int[n];
        int[] orange = new int[n];
        int maxApple = 0;
        int choseOrange = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            apple[i] = scanner.nextInt();
            orange[i] = scanner.nextInt();
            if (apple[i] > maxApple) {
                maxApple = apple[i];
                choseOrange = orange[i];
                index = i;
//                System.out.println("maxApple = " + maxApple + ", choseOrange = " + choseOrange);
            }
            if (apple[i] == maxApple && orange[i] > choseOrange) {
                maxApple = apple[i];
                choseOrange = orange[i];
                index = i;
//                System.out.println("maxApple = " + maxApple + ", choseOrange = " + choseOrange);
//                System.out.println("index = " + index + 1);
            }

        }
        System.out.println(index + 1);
        scanner.close();
    }
}
