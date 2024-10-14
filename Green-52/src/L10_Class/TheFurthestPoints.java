package L10_Class;

import java.util.Scanner;

public class TheFurthestPoints {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        Point pointM = new Point(x, y);
        int n = in.nextInt();
        int max = 0;
        int maxX = 0;
        int maxY = 0;
        for (int i = 1; i <= n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            Point pointI = new Point(a, b);
            int distance =  pointI.calcDistance(pointM);
            if (distance > max) {
                max = distance;
                maxX = a;
                maxY = b;
            }
        }
        System.out.println(maxX + " " + maxY);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calcDistance(Point point) {
        return Math.abs(x - point.x) + Math.abs(y - point.y);
    }
}
