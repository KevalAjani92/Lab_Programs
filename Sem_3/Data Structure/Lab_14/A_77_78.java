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

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        } else if (root.key == key) {
            return true;
        } else if (root.key < key) {
            return searchRec(root.right, key);
        } else {
            return searchRec(root.left, key);
        }
    }

    public void deleteElement(int key) {
        root = deleteElementRec(root, key);
    }

    private Node deleteElementRec(Node root, int key) {
        if (root == null)
            return root;

        if (root.left != null && root.left.key == key) {
            if (root.left.right == null) {
                root.left = root.left.left;
            }
            Node succ = minValue(root.left.right);
            Node temp = root.left.left;
            root.left = root.left.right;
            succ.left = temp;
        } else if (root.right != null && root.right.key == key) {
            if (root.right.right == null) {
                root.right = root.right.left;
            } else {
                Node succ = minValue(root.right.right);
                Node temp = root.right.left;
                root.right = root.right.right;
                succ.left = temp;
            }
        } else if (key < root.key)
            root.left = deleteElementRec(root.left, key);
        else if (key > root.key)
            root.right = deleteElementRec(root.right, key);

        return root;
    }

    private Node minValue(Node curr) {
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
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

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
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

public class A_77_78 {
    public static void main(String[] args) {
        //add,search and delete Node in Tree
        // PreOrder,InOrder,PostOrder Traversals
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

        t1.deleteElement(75);
        t1.printTree();
    }
}