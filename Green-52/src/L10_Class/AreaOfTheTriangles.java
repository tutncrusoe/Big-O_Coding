package L10_Class;

import java.util.Scanner;

public class AreaOfTheTriangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res = 0;
        for (int i = 0; i < n; ++i) {
            int x, y;
            double p;
            x = sc.nextInt();
            y = sc.nextInt();
            Point A = new Point();
            Point B = new Point();
            Point C = new Point();
            A.x = x;
            A.y = y;
            x = sc.nextInt();
            y = sc.nextInt();
            B.x = x;
            B.y = y;
            x = sc.nextInt();
            y = sc.nextInt();
            C.x = x;
            C.y = y;
            double AB = dist(A, B);
            double BC = dist(B, C);
            double AC = dist(A, C);
            p = (AB + BC + AC) / 2;
            double area = Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
            res += area;
        }
        System.out.printf("%.2f", res);
        sc.close();
    }

    static class Point {
        public int x, y;

        public Point() {
        }
    }

    public static double dist(Point A, Point B) {
        return Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
    }
}