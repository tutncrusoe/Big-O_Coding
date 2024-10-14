package interviews;

import java.util.function.Predicate;

public class Interview2 {

    public static void main(String[] args) {

        int x_ = 5;
        int x__ = print(x_); // print(int a)

        Integer y = 5;
        int y__ = print(y); // print(Integer a)

        Long z = 5L;
        long z__ = print(z); // print(Long a)

        short q = 5;
        int q__ = print(q); // print(int a)

        byte c = 5;
        short d = 10;
        int e = c + d;
        long f = c + d;
//        short g = c + d;


        int z_ = 5;
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i > z_);
        // Calling Predicate method
        System.out.println(lesserthan.test(10));
    }

    private static int print(Long a) {
        return 1;
    }

    private static int print(Integer a) {
        return 1;
    }

    private static int print(int a) {
        return 1;
    }
}

//interface Boss {
//
//    double a = 5.0f;
//    abstract int run();
//}
//
//abstract class Car implements Boss {
//    abstract void walk();
//}
//
//class Honda extends Car {
//
//    @Override
//    void walk() {
//        System.out.println(1);
//    }
//
//    @Override
//    public int run(int a) {
//        return a;
//    }
//}

/***
 .collect()
 .
 .findFirst()
 .map()
 .sum()
 */

