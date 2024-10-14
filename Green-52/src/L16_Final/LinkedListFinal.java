package L16_Final;

import java.util.Scanner;

public class LinkedListFinal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList ll1 = new LinkedList();
        int j;
        while (true){
            j = sc.nextInt();
            if (j == - 1) break;
            ll1.add(j);
        }

        LinkedList ll2 = new LinkedList();
        while (true){
            j = sc.nextInt();
            if (j == - 1) break;
            ll2.add(j);
        }



    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class LinkedList {
        Node head;
        Node tail;

        public LinkedList() {
        }

        private void add(int data) {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = this.tail = newNode;
            } else {
                this.tail.next = newNode;
                this.tail = newNode;
            }
        }
    }
}
