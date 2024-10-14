package L10_Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static L10_Class.FractionTLF.UCLN;

public class TheLargestFraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Object> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            FractionTLF fraction = new FractionTLF(x, y);
            list.add(fraction);
        }

        float[] check = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            FractionTLF fraction = (FractionTLF) list.get(i);
            check[i] = (float) fraction.denom / fraction.num;
        }

        int index = 0;
        float min = 1000;
        for (int i = 0; i < list.size(); i++) {
            if (check[i] < min) {
                min = check[i];
                index = i;
            }
        }

        FractionTLF fraction = (FractionTLF) list.get(index);

        int ucln = UCLN(fraction.num, fraction.denom);
        System.out.println(fraction.num / ucln + " " + fraction.denom / ucln);
    }
}

class FractionTLF {
    int num;
    int denom;

    public FractionTLF(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    protected static int UCLN(int num, int denom) {
        if (denom == 0) return num;
        if (num % denom == 0) return denom;
        return UCLN(denom, num % denom);
    }
}