package interview_questions;

/**
 * Created by hailstone01 on 2/18/16.
 */
public class TreeTraverse {
    private Node root;

    private class Node {
        private int data;
        private Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        root = add(root, data);
    }

    private Node add(Node x, int data) {
        if (x == null) {
            return new Node(data);
        }

        if (data > x.data) {
            x.right = add(x.right, data);
            return x;
        } else if (data < x.data) {
            x.left = add(x.left, data);
            return x;
        } else {
            x.data = data;
            return x;
        }
    }

    public void traverse() {

        traverse(root, 1);
    }

    private void traverse(Node x, int depth) {
        if (x == null) return;
        System.out.println(x.data);
        while (x != null) {
            x = x.left;
            System.out.println(x.data);

        }
    }

    public static void main(String[] args) {
        TreeTraverse treeTraverse = new TreeTraverse();
        treeTraverse.add(5);
        treeTraverse.add(3);
        treeTraverse.add(7);
        treeTraverse.add(2);
        treeTraverse.add(1);
        treeTraverse.add(8);

        treeTraverse.traverse();
    }
}
