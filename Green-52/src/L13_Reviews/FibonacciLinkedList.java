package L13_Reviews;

import java.util.LinkedList;
import java.util.Scanner;

public class FibonacciLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = sc.nextInt();

        LinkedListFLL list = new LinkedListFLL();
        list.add(x);
        list.add(y);
        list.fibonacci(n);
//        list.print();
    }
}

class NodeFLL {
    long data;
    NodeFLL next;

    public NodeFLL(long data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListFLL {
    NodeFLL head;
    NodeFLL tail;

    public LinkedListFLL() {
        this.head= this.tail = null;
    }

    public void add(long data) {
        NodeFLL newNode = new NodeFLL(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void print() {
        NodeFLL curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public void fibonacci(long n) {
        System.out.print(head.data + " ");
        System.out.print(tail.data + " ");
        NodeFLL currMinusTwo = head;
        NodeFLL currMinusOne = tail;
        NodeFLL curr;
        int i = 2;
        while (i < n) {
            long data = (currMinusOne.data + currMinusTwo.data) % 1000007;
            curr = new NodeFLL(data);
            System.out.print(curr.data + " ");
            currMinusOne.next = curr;
            currMinusTwo = currMinusOne;
            currMinusOne = curr;
            i++;
        }
//        System.out.println();
    }
}
