package L12_LinkedList;

import java.util.Scanner;

public class TheSecondLargestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        while (true) {
            double n = sc.nextDouble();
            if (n == -1) break;
            linkedList.add(n);
        }

        linkedList.theSecondLargestNumber();
        sc.close();
    }

    private static class Node {
        double data;
        Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class LinkedList {
        Node head;
        Node tail;

        public LinkedList() {
            this.head = this.tail = null;
        }

        private void add(double data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }

        private void theSecondLargestNumber() {
            double max = -1.0;
            double maxSecond = -1.0;

            Node curr = this.head;
            while (curr != null) {
//                System.out.println(curr.data);
                if (max == -1) {
                    max = curr.data; // 1.1
                    maxSecond = curr.data; // 1.1
                } else if (curr.data > max) {
                    maxSecond = max;
                    max = curr.data; // 2.2
//                    System.out.println(max + " " + maxSecond);
                } else if (curr.data < max && curr.data > maxSecond) {
                    maxSecond = curr.data;
                }
                curr = curr.next;
            }

            if (maxSecond == max) {
                System.out.println(-1);
            } else {
                System.out.println(maxSecond);
            }
        }
    }
}




