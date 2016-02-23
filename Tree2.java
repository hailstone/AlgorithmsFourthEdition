import java.util.ArrayList;

/**
 * Created by hailstone01 on 2/19/16.
 */
public class Tree2 {
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
            x.left = add(x.left, n);
        } else {
            x.data = n;
        }
        return x;
    }

    public void delete(int n) {
        root = delete(root, n);
    }

    private Node delete(Node x, int n) {
        if (x == null) return null;

        if (n > x.data) {
            x.right = delete(x.right, n);
            return x;
        } else if (n < x.data) {
            x.left = delete(x.left, n);
            return x;
        } else {
            if (x.left == null) {
                return x.right;
            } else if (x.right == null) {
                return x.left;
            } else {
//                Node t = x;
//                x = min(t.right);
//                x.right = deleteMin(t.right);
//                x.left = t.left;
//
//                return x;
                Node temp = min(x.right);
                temp.right = deleteMin(x.right);
                temp.left = x.left;

                return temp;
            }
        }
    }

    public Node min(Node x) {
        if (x.left == null) return x;
        else return min(x.left);
    }

    public Node deleteMin(Node x) {
        if (x.left == null) return x.right;
        else {
            x.left = deleteMin(x.left);
            return x;
        }
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
        String s = "35 10 52 24 47 77 17 39 55 94 18 80";
        Tree2 tree = new Tree2();
        for (String item : s.split(" ")) {
            tree.add(Integer.valueOf(item));
        }

        tree.delete(18);
        tree.delete(10);
        tree.delete(52);
        tree.traverse();
    }
}
