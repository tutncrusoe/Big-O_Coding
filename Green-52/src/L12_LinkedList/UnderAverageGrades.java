package L12_LinkedList;

import java.util.Scanner;

public class UnderAverageGrades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = 0;
        LinkedList2 linkedList2 = new LinkedList2();
        while (true) {
            n = sc.nextDouble();
            if (n == -1) break;
            linkedList2.add(n);
        }
        linkedList2.findUnderFive(5.0);
    }
}

class Node2 {
    double data;
    Node2 next;

    public Node2(double data) {
        this.data = data;
    }

}

class LinkedList2 {
    Node2 head;
    Node2 tail;

    public LinkedList2() {
    }

    protected void add(double data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    protected void findUnderFive(double mark) {
        while (this.head != null) {
            if (this.head.data < mark) {
                System.out.println(this.head.data);
            }
            this.head = this.head.next;
        }
    }
}
