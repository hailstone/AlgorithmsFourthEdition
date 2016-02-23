import java.util.ArrayList;

/**
 * Created by hailstone01 on 2/19/16.
 */
public class Tree {
    private Node root;

    private class Node {
        private int data;
        private Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int n) {
        root = add(root, n);
    }

    private Node add(Node x, int n) {
        if (x == null) return new Node(n);

        if (n > x.data) {
            x.right = add(x.right, n);
        } else if (n < x.data) {
            x.left = add(x.left , n);
        } else {
            x.data = n;
        }
        return x;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(Node x) {
        if (x == null) return;
        ArrayList<Node> arrayList = new ArrayList<Node>();
        arrayList.add(x);

        while (!arrayList.isEmpty()) {
            ArrayList<Node> temp = new ArrayList<Node>();

            while (!arrayList.isEmpty()) {
                Node node = arrayList.remove(0);
                System.out.print(node.data + " ");
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            arrayList = temp;
        }
    }

    public static void main(String[] args) {
        String s = "22 56 40 93 35 44 80 66 91 73";
        Tree tree = new Tree();
        for (String item : s.split(" ")) {
            tree.add(Integer.valueOf(item));
        }

        tree.traverse();
    }
}
