package L13_Reviews;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        LinkedListFE list = new LinkedListFE();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        list.findElement(x);
    }
}

class NodeFE {
    int data;
    NodeFE next;

    public NodeFE(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListFE {
    NodeFE head;
    NodeFE tail;

    public LinkedListFE() {
        this.head = this.tail = null;
    }

    public void add(int data) {
        NodeFE newNode = new NodeFE(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void findElement(int x) {
        boolean flag = false;
        int index = 1;
        NodeFE temp = head;
        while (temp != null) {
            if (temp.data == x) {
                flag = true;
                break;
            }
            temp = temp.next;
            index++;
        }
        if (flag) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}