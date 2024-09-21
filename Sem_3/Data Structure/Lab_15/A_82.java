class BinaryTreeFromPrePost {
    class Node {
        char key;
        Node left;
        Node right;

        Node(char key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    private int preIndex = 0;
    private int postIndex = 0;

    public void constructFromPrePost(char[] pre, char[] post){
        root = constructFromPrePostRec(pre, post);
    }

    public Node constructFromPrePostRec(char[] pre, char[] post) {
        Node root = new Node(pre[preIndex++]);

        if (root.key != post[postIndex]) {
            root.left = constructFromPrePostRec(pre, post);
        }
        if (root.key != post[postIndex]) {
            root.right = constructFromPrePostRec(pre, post);
        }

        postIndex++;
        return root;
    }

    // Helper function to print inorder traversal (for testing purposes)
    public void printInorder() {
        printInorderRec(root);
    }

    private void printInorderRec(Node root) {
        if (root == null)
            return;
        printInorderRec(root.left);
        System.out.print(root.key + " ");
        printInorderRec(root.right);
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

public class A_82 {
    public static void main(String[] args) {
        BinaryTreeFromPrePost tree = new BinaryTreeFromPrePost();
        // int[] postorder = { 4, 5, 2, 6, 7, 3, 1 };
        // int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };
        char[] postorder={'G','D','B','H','I','E','F','C','A'};
        char[] preorder={'A','B','D','G','C','E','H','I','F'};

        tree.constructFromPrePost(preorder, postorder);
        tree.printTree();
        // tree.printInorder();
    }
}
