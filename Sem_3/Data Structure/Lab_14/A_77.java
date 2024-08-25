class Tree{
    class Node{
        int info;
        Node left;
        Node right;
        public Node(int info){
            this.info = info;
            this.left = null;
            this.right = null;
        }
    }
    public Node root = null;
    public void insert(int info){
        root = addElement(root,info);
    }
    private Node addElement(Node root,int info){
        Node newNode = new Node(info);
        if(root == null){
            root = newNode;
            return root;
        }
        if(info<root.info){
            root.left = addElement(root.left, info);
        }else if(info>root.info){
            root.right = addElement(root.right, info);
        }
        return root;
    }
    public void preOrder(){
        preOrderRec(root);
    }
    private void preOrderRec(Node root){
        if(root == null){
            System.out.println("Empty");
        }else{
            System.out.print(root.info+" ");
        }

        if(root.left != null){
            preOrderRec(root.left);
        }
        if(root.right != null){
            preOrderRec(root.right);
        }
    }
    public void inorder() {
        inorderRec(root);
    }
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }
}
public class A_77 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.insert(50);
        t1.insert(30);
        t1.insert(20);
        t1.insert(40);
        t1.insert(70);
        t1.insert(60);
        t1.insert(80);

        // t1.preOrder();
        t1.inorder();
    }
}