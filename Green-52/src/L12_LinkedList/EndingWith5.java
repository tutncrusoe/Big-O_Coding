package L12_LinkedList;

import java.util.Scanner;

public class EndingWith5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LLEW5 llew5 = new LLEW5();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            llew5.add(x);
        }
        llew5.findFive();
    }
}

class NodeEW5 {
    int data;
    NodeEW5 next;

    public NodeEW5(int data) {
        this.data = data;
        this.next = null;
    }
}

class LLEW5 {
    NodeEW5 head;
    NodeEW5 tail;

    public LLEW5() {
        this.head = this.tail = null;
    }

    protected void add(int data) {
        NodeEW5 newNode = new NodeEW5(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    protected void findFive() {
        NodeEW5 curr = this.head;
        while (curr != null) {
            if (!isEndFive(curr.data)) {
                System.out.print(curr.data + " ");
            }
            curr = curr.next;
        }
    }

    protected boolean isEndFive(int value) {
        int temp = Math.abs(value);
        value = Math.abs(value) / 10;
        if (temp - value * 10 == 5) {
            return true;
        }
        return false;
    }
}
