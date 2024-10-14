package L12_LinkedList;

import java.util.Scanner;

public class TheGreatestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt(), sc.nextInt(), sc.nextInt());
            linkedList.add(newNode);
        }

        linkedList.date();
    }


    private static class Node {
        int day;
        int month;
        int year;
        Node next;

        public Node() {
        }

        public Node(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    private static class LinkedList {
        Node head;
        Node tail;

        public LinkedList() {
            this.head = this.tail = null;
        }

        private void add(Node newNode) {
            if (this.head == null) {
                this.head = this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }

        private void date() {
            int maxDay = 0;
            int maxMonth = 0;
            int maxYear = 0;
            Node curr = this.head;
            while (curr != null) {
                if (curr.year > maxYear ||
                        curr.year == maxYear && curr.month > maxMonth ||
                        curr.year == maxYear && curr.month == maxMonth && curr.day > maxDay) {
                    maxDay = curr.day;
                    maxMonth = curr.month;
                    maxYear = curr.year;
                }
                curr = curr.next;
            }

            System.out.println(maxDay + " " + maxMonth + " " + maxYear);
        }
    }
}
