package L12_LinkedList;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        int n;
        while (true) {
            n = sc.nextInt();
            if (n == -1) break;
            linkedList.add(n);
        }

        linkedList.palindromeNumber();
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
            this.head = this.tail = null;
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

        private void palindromeNumber() {
            int index = 0;
            Node curr = this.head;
            while (curr != null) {
                String isSym = recursion(String.valueOf(curr.data), 0, String.valueOf(curr.data).length() / 2, true);
                if (isSym == "YES") {
                    System.out.print(index + " ");
                }
                curr = curr.next;
                index++;
            }
        }
    }

    private static String recursion(String str, int start, int end, boolean isSym) {
        if (start == end) {
            if (isSym) return "YES";
            else return "NO";
        } else {
            if (str.charAt(str.length() - 1 - start) != str.charAt(start)) {
                return "NO";
            }
            return recursion(str, ++start, end, isSym);
        }
    }
}

