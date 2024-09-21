import java.util.LinkedList;
import java.util.Queue;

class TreeImplement {
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void addElement(int[] arr) {
        Queue<Node> queue = new LinkedList<>();
        root = new Node(arr[0]);
        queue.add(root);
        int i = 0;
        while (i < arr.length - 1) {
            Node current = queue.poll();
            current.left = new Node(arr[++i]);
            current.right = new Node(arr[++i]);
            queue.add(current.left);
            queue.add(current.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root == null) {
            System.out.println("Empty");
        } else {
            System.out.print(root.key + " ");
        }

        if (root.left != null) {
            preOrderRec(root.left);
        }
        if (root.right != null) {
            preOrderRec(root.right);
        }
    }

    private static void printTree(Node node, int level) {
        if (node == null) {
            return;
        }

        // Print the right subtree first, indented by the level
        printTree(node.right, level + 1);

        // Print the current node
        System.out.println(" ".repeat(level * 4) + node.key);

        // Print the left subtree
        printTree(node.left, level + 1);
    }

    public void printTree() {
        printTree(root, 0);
    }
}

public class Extra {
    public static void main(String[] args) {
        TreeImplement t1 = new TreeImplement();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        t1.addElement(arr);
        // t1.preOrder();
        t1.printTree();
    }
}
