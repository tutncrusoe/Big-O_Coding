package L12_LinkedList;

import java.util.Scanner;

public class AvailableRoom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < n; i++) {
            String number = sc.next();
            int price = sc.nextInt();
            int status = sc.nextInt();
            Node newNode = new Node(number, price, status);
            linkedList.add(newNode);
        }

        linkedList.checkRoom();
    }

    static class Node {
        String number;
        int price;
        int status;
        Node next;

        public Node() {
        }

        public Node(String number, int price, int status) {
            this.number = number;
            this.price = price;
            this.status = status;
            this.next = null;
        }

    }

    static class LinkedList {
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

        private void checkRoom() {
            Node curr = this.head;
            while (curr != null) {
                if (curr.status == 0) {
                    System.out.println(curr.number + " " + curr.price);
                }
                curr = curr.next;
            }
        }
    }
}
