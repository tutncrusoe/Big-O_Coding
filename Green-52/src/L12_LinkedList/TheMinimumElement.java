package L12_LinkedList;

import java.util.Scanner;

public class TheMinimumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList1 linkedList1 = new LinkedList1();

        int n;
        do {
            n = sc.nextInt();
            if (n == 0) break;
            linkedList1.add(n);
        } while (true);
        int min = linkedList1.findMin();
        System.out.println(min);
    }
}

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node1 head;
    Node1 tail;

    public LinkedList1() {
        this.head = this.tail = null;
    }

    protected void add(int data) {
        Node1 newNode = new Node1(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    protected int findMin() {
        int min = this.head.data;
        Node1 curr = this.head;
        while (curr != null) {
            if (curr.data < min) {
                min = curr.data;
            }
            curr = curr.next;
        }
        return min;
    }
}