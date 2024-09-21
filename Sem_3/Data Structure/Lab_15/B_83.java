class Tree {
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

    public void insert(int key) {
        root = addElement(root, key);
    }

    private Node addElement(Node root, int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return root;
        }
        if (key < root.key) {
            root.left = addElement(root.left, key);
        } else if (key > root.key) {
            root.right = addElement(root.right, key);
        }
        return root;
    }

    public void addElementItr(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        while (true) {
            if (temp.key < key) {
                if (temp.right == null) {
                    temp.right = newNode;
                    break; // Exit after inserting the new node
                } else {
                    temp = temp.right;
                }
            } else if (temp.key > key) {
                if (temp.left == null) {
                    temp.left = newNode;
                    break; // Exit after inserting the new node
                } else {
                    temp = temp.left;
                }
            } else {
                break;
            }
        }
    }

    public int findSmallest() {
        if(root==null){
            return -1;
        }
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.key;
    }
    public int findLargest() {
        if(root==null){
            return -1;
        }
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.key;
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

public class B_83 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.addElementItr(50);
        t1.addElementItr(25);
        t1.addElementItr(75);
        t1.addElementItr(22);
        t1.addElementItr(40);
        t1.addElementItr(60);
        t1.addElementItr(80);
        t1.addElementItr(90);
        t1.addElementItr(15);
        t1.addElementItr(30);

        // t1.printTree();
        System.out.println(t1.findSmallest());
        System.out.println(t1.findLargest());

    }
}
