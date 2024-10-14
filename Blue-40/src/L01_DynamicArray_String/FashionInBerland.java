package L01_DynamicArray_String;

import java.util.ArrayList;
import java.util.Scanner;

public class FashionInBerland {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        int count = 0;
        if (n == 1) {
            if (array.get(0) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (array.get(i) == 0) {
                    count++;
                }
            }
            if (count >= 2 || count == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}