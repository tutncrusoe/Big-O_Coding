package L14_Tree;

import java.util.Scanner;

public class CalculateTheHeightOfATree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST bst = new BST();
        for (int i = 0; i < n; i++) {
            bst.add(sc.nextInt());
        }

        System.out.println(bst.height());
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
                if (left == null) {
                    left = new Node(value);
                } else left.add(value);
            } else {
                if (right == null) right = new Node(value);
                else right.add(value);
            }
        }

        private int height() {
            int leftHeight;
            if (left == null) leftHeight = 0;
            else leftHeight = left.height();

            int rightHeight;
            if (right == null) rightHeight = 0;
            else rightHeight = right.height();

            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    private static class BST {
        Node root;
        int height;

        public BST() {
            this.root = null;
            this.height = 0;
        }

        private void add(int value) {
            if (root == null) root = new Node(value);
            else root.add(value);
        }

        private int height() {
            if (root == null) return 0;
            else return root.height();
        }
    }
}
