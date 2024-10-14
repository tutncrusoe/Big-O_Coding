package L13_Reviews;

import java.util.Scanner;

public class CreateList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedListCL linkedListCL = new LinkedListCL();
        for (int i = 0; i < n; i++) {
            linkedListCL.add(sc.nextInt());
        }
//        linkedListCL.print();
        linkedListCL.createList();
        sc.close();
    }
}

class NodeCL {
    int data;
    NodeCL next;

    public NodeCL(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListCL {
    NodeCL head;
    NodeCL tail;

    public LinkedListCL() {
        this.head = this.tail = null;
    }

    public void add(int data) {
        NodeCL newNode = new NodeCL(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void print() {
        NodeCL temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void createList() {
        NodeCL temp = this.head;
        System.out.print(temp.data + " ");
        NodeCL newNode = temp.next;
        while (newNode != null) {
            System.out.print(newNode.data + temp.data + " ");
            temp = newNode;
            newNode = newNode.next;
        }
    }
}