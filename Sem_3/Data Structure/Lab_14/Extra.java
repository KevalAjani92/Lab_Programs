import java.util.LinkedList;
import java.util.Queue;

class TreeImplement{
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
    public void addElement(int[] arr){
        Queue<Node> queue = new LinkedList<>();
        root = new Node(arr[0]);
        queue.add(root);
        int i=0;
        while (i<arr.length-1) {
            Node current = queue.poll();
            current.left = new Node(arr[++i]);
            current.right = new Node(arr[++i]);
            queue.add(current.left);
            queue.add(current.right);
        }
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
}
public class Extra {
    public static void main(String[] args) {
        TreeImplement t1 = new TreeImplement();
        int[] arr = {1,2,3,4,5,6,7};
        t1.addElement(arr);
        t1.preOrder();
    }
}
