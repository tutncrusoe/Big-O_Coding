package L10_Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingApples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int weight = scanner.nextInt();
            int price = scanner.nextInt();
            Apple apple = new Apple(weight, price);
            apples.add(apple);
        }

        int maxWeight = 0;
        int maxPrice = 0;
        int index = 0;
        for (int i = 0; i < apples.size(); i++) {
            Apple apple = apples.get(i);
            if (apple.weight > maxWeight) {
                maxWeight = apple.weight;
                maxPrice = apple.price;
                index = i;
            }
            if (apple.weight == maxWeight && apple.price > maxPrice) {
                maxPrice = apple.price;
                index = i;
            }
        }

        System.out.println(index);
    }
}


class Apple {
    int weight;
    int price;

    public Apple (int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
}