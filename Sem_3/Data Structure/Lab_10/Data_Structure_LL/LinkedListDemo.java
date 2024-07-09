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
            displayLinkedList();
            System.out.println("After inserted in order ->");
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
        System.out.println("After Reversing LinkedList -> ");
        displayLinkedList();
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
        displayLinkedList();
    }
}
