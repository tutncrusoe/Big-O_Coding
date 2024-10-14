package L14_Tree;

import java.util.Scanner;

public class FindTheMinimumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BSTree bsTree = new BSTree();
        for (int i = 0; i < n; i++) {
            bsTree.add(sc.nextInt());
        }

        System.out.println(bsTree.findMin().data);
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

        private void add(int value) {
            if (value < data) {
                if (this.left == null) this.left = new Node(value);
                else this.left.add(value);
            } else {
                if (this.right == null) this.right = new Node(value);
                else this.right = new Node(value);
            }
        }

        private Node findMin() {
            if (left == null) {
                return this;
            }
            return left.findMin();
        }
    }

    private static class BSTree {

        Node root;

        public BSTree() {
            this.root = null;
        }

        private void add(int value) {
            if (root == null) root = new Node(value);
            else root.add(value);
        }

        private Node findMin() {
            return root.findMin();
        }
    }
}
