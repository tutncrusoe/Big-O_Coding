package L12_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class PrimeNumbersInLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList3 linkedList = new LinkedList3();
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            linkedList.add(n);
        }
        System.out.println(linkedList.countPrime());
    }
}

class Node3 {
    int data;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.next = null;
    }


}

class LinkedList3 {
    Node3 head;
    Node3 tail;

    public LinkedList3() {
        this.head = this.tail = null;
    }

    protected void add(int data) {
        Node3 node = new Node3(data);
        if (this.head == null) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
    }

    protected int countPrime() {
        int count = 0;
        Node3 temp = this.head;
        while (temp != null) {
            if (isPrime(temp.data)) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    protected static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
