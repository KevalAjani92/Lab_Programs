package Data_Structure_CIR_LL;
public class CIR_LinkedList {
    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    public Node first=null;
    public Node last=null;

    public void insertAtFirst(int data){
        Node newNode=new Node(data);

        if(first==null){
            newNode.link=newNode;
            first=newNode;
            last=newNode;
        }else{
            newNode.link=first;
            last.link=newNode;
            first=newNode;
        }
        System.out.println("After inserting At First ->");
        displayLinkedList();
    }
    public void inserAtLast(int data){
        Node newNode=new Node(data);

        if(first==null){
            newNode.link=newNode;
            first=newNode;
            last=newNode;
        }else{
            newNode.link=first;
            last.link=newNode;
            last=newNode;
        }
        System.out.println("After inserting At Last ->");
        displayLinkedList();
    }
    public void inserInOrder(int data){
        Node newNode=new Node(data);

        if(first==null){
            newNode.link=newNode;
            first=newNode;
            last=newNode;
            System.out.println("After inserting In Order ->");
            displayLinkedList();
            return;
        }

        if(newNode.info<=first.info){
            newNode.link=first;
            last.link=newNode;
            first=newNode;
            System.out.println("After inserting In Order ->");
            displayLinkedList();
            return;
        }
        Node save=first;
        while (save!=last && newNode.info>=save.link.info) {
            save=save.link;
        }
        newNode.link=save.link;
        save.link=newNode;
        if(save==last){
            last=newNode;
        }
        System.out.println("After inserting In Order ->");
        displayLinkedList();
    }
    public void deleteNode(int data){
        if(first==null){
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save=first;
        Node pred=null;
        while (save!=last && save.info!=data) {
            pred=save;
            save=save.link;
        }
        if(save.info!=data){
            System.out.println("Node Not Found");
            return;
        }
        if(first==last){
            first=null;
            last=null;
        }else if(save==first){
            first=first.link;
            last=first;
        }else{
            pred.link=save.link;
            if(save==last){
                last=pred;
            }
        }
        System.out.println("After deleting a Node ->");
        displayLinkedList();
    }
    public int countNode(){
        int count=0;
        if(first==null){
            return count;
        }
        Node save=first;
        while (save!=last) {
            count++;
            save=save.link;
        }
        return count;
    }
    public void displayLinkedList() {
        if (first == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node save = first;
        while (save != last) {
            System.out.print(save.info);
            if (save.link != last) {
                System.out.print("->");
            }
            save = save.link;
        }
        System.out.println();
    }
}