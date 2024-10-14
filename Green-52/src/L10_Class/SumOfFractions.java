package L10_Class;

import java.util.Scanner;

public class SumOfFractions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        Fraction one = new Fraction(a, b);
        Fraction two = new Fraction(c, d);
        Fraction three = Fraction.sum(one, two);
        System.out.println(three.num + " " + three.den);

        SumOfFractions.Inner inner = new SumOfFractions.Inner();
        Inner inner1 = new Inner();
    }

    static class Inner {
        public Inner() {}
    }
}

class Fraction {

    public int num;
    public int den;

    public Fraction() {}

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    protected static Fraction sum(Fraction one, Fraction two) {
        int numSum = one.num * two.den + one.den * two.num;
        int denSum = one.den * two.den;
        int ucln = UCLN(numSum, denSum);
        numSum = numSum / ucln;
        denSum = denSum / ucln;
        return new Fraction(numSum, denSum);
    }

    protected static int UCLN(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) return b;
        return UCLN(b, a % b);
    }
}