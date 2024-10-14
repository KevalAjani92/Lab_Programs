package Data_Structure_LL;

public class LinkedListDemo {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        Node temp = first;
        first = newNode;
        first.link = temp;
        System.out.println("Ater inserted at First ->");
        displayLinkedList();
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            System.out.println("After inserted at End ->");
            displayLinkedList();
            return;
        }
        Node last = first;
        while (last.link != null) {
            last = last.link;
        }
        last.link = newNode;
        System.out.println("After inserted at End ->");
        displayLinkedList();
    }

    public void insertInOrdr(int data) {
        Node newNode = new Node(data);

        if (first == null || newNode.info <= first.info) {
            newNode.link = first;
            first = newNode;
            System.out.println("After inserted in order ->");
            displayLinkedList();
            return;
        }
        Node save = first;
        while (save.link != null && newNode.info >= save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
        System.out.println("After inserted in order ->");
        displayLinkedList();
    }

    public void deleteElement(int key) {
        if (first == null) {
            System.out.println("Empty");
            return;
        }
        Node save = first;
        if (first.info == key) {
            first = first.link;
            System.out.println("After deleting a node ->");
            displayLinkedList();
            return;
        }
        while (save.link != null && save.link.info != key) {
            save = save.link;
        }
        if (save.link == null) {
            System.out.println("Node Not Found");
            return;
        }
        save.link = save.link.link;
        System.out.println("After deleting a node ->");
        displayLinkedList();
    }

    public LinkedListDemo copyLinkedList() {
        if (first == null) {
            System.out.println("Linked List is Empty");
            return null;
        }
        Node save = first;
        LinkedListDemo copyLL = new LinkedListDemo();
        copyLL.first = new Node(save.info);
        Node saveCopy = copyLL.first;

        save = save.link;
        while (save != null) {
            saveCopy.link = new Node(save.info);
            saveCopy = saveCopy.link;
            save = save.link;
        }
        return copyLL;
    }

    public int countNode() {
        int count = 0;
        if (first == null) {
            count = 0;
            return count;
        }
        Node save = first;
        while (save != null) {
            count++;
            save = save.link;
        }
        return count;
    }

    public void displayLinkedList() {
        if (first == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info);
            if (save.link != null) {
                System.out.print("->");
            }
            save = save.link;
        }
        System.out.println();
    }

    public void reverseLL() {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node prev = null, next = null;
        Node current = first;

        while (current != null) {
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        first = prev;
        // System.out.println("After Reversing LinkedList -> ");
        // displayLinkedList();
    }

    public void sortLL() {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save;
        boolean flag;
        do {
            save = first;
            flag = false;

            while (save.link != null) {
                if (save.info > save.link.info) {
                    int temp = save.info;
                    save.info = save.link.info;
                    save.link.info = temp;
                    flag = true;
                }
                save = save.link;
            }
        } while (flag);
        System.out.println("After Sorting a LinkedList -> ");
        displayLinkedList();
    }

    public void checkEquality(LinkedListDemo l1) {
        if (this.countNode() != l1.countNode()) {
            System.out.println("Both LinkedList Are Not Same");
            return;
        }
        Node save = this.first;
        Node save_l1 = l1.first;
        while (save != null) {
            if (save.info != save_l1.info) {
                System.out.println("Both LinkedList Are Not Same");
                return;
            }
            save = save.link;
            save_l1 = save_l1.link;
        }
        System.out.println("Both LinkedList Are Same");
    }

    public void removeDuplicate() {
        if (first == null) {
            System.out.println("Empty");
            return;
        }

        Node save = first;
        Node temp = first;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            save = temp.link;
            while (save != null) {
                if (temp.info == save.info) {
                    prev.link = save.link;
                } else {
                    prev = save;
                }
                save = save.link;
            }
            temp = temp.link;
        }
        System.out.println("After removing Duplicate -> ");
        displayLinkedList();
    }

    public void swapTwoConsecutive() {
        if (first == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp1 = null, temp2 = null, current = first;
        while (current != null && current.link != null) {
            if (temp1 != null) {
                temp1.link.link = current.link;
            }
            temp1 = current.link;
            current.link = current.link.link;
            temp1.link = current;

            if (temp2 == null)
                temp2 = temp1;

            current = current.link;
        }
        first = temp2;
        displayLinkedList();
    }

    public void swapKthNode(int k) {
        if (k > countNode()) {
            System.out.println("Enter key less than Total Number Of Node(which is " + countNode() + ")");
            return;
        }
        if (first == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        int front = k;
        int rear;
        if(countNode()%2==1){
            rear = countNode() - k + 1;
        }else{
            rear = countNode() - k;
        }
        int middle = (int) Math.ceilDiv(countNode(), 2);
        if (k > middle) {
            int temp = front;
            front = rear;
            rear = temp;
        }
        Node save1=first,pred1=null,save2=first,pred2=null;
        for (int i = 1; i < countNode(); i++) {
            if(i<front){
                pred1=save1;
                save1=save1.link;
            }
            if(i<rear){
                pred2=save2;
                save2=save2.link;
            }
        }
        if(k==1 || k==countNode()){
            save2.link=first.link;
            save1.link=null;
            pred2.link=first;
            first=save2;
            return;
        }
        Node temp=pred1.link;
        pred1.link=pred2.link;
        pred2.link=temp;

        temp=save1.link;
        save1.link=save2.link;
        save2.link=temp;
    }
    private int getGCD(int a,int b){
        int min;
        if(a<b){
            min=a;
        }else{
            min=b;
        }
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }
    public void addGCD(){
        Node save=first;
        while (save.link!=null) {
            int gcd=getGCD(save.info, save.link.info);
            if(gcd!=-1){
                Node newNode=new Node(gcd);
                newNode.link=save.link;
                save.link=newNode;
            }
            save=save.link.link;
        }
    }
}
