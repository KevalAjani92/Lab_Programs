package Data_Structure_CIR_LL;

public class CIR_LinkedList {
    class Node {
        int info;
        Node link;

        public Node(int info) {
            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;
    public Node last = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
            return;
        }
        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }

    public void insertInOrder(int data) {
        Node newNode = new Node(data);

        if (first == null) {
            newNode.link = newNode;
            first = newNode;
            last = newNode;
            return;
        }

        if (newNode.info <= first.info) {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
            return;
        }
        Node save = first;
        while (save != last && newNode.info >= save.link.info) {
            save = save.link;
        }
        newNode.link = save.link;
        save.link = newNode;
        if (save == last) {
            last = newNode;
        }
    }

    public void deleteNode(int data) {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save = first;
        Node pred = null;
        while (save != last && save.info != data) {
            pred = save;
            save = save.link;
        }
        if (save.info != data) {
            System.out.println("Node Not Found");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
        } else if (save == first) {
            first = first.link;
            last.link = first;
        } else {
            pred.link = save.link;
            if (save == last) {
                last = pred;
            }
        }
        System.out.println("After deleting a Node ->");
        displayLinkedList();
    }

    public int countNode() {
        int count = 0;
        if (first == null) {
            return count;
        }
        Node save = first;
        while (save != last) {
            count++;
            save = save.link;
        }
        count++;
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
            if (save.link != null) {
                System.out.print("->");
            }
            save = save.link;
        }
        System.out.print(save.info);
        System.out.println();
    }

    public CIR_LinkedList splitIntoTwoHalves() {
        CIR_LinkedList l2 = new CIR_LinkedList();
        int count = Math.ceilDiv(this.countNode(), 2);

        int cuurrentPos = 1;
        Node save = first;
        while (cuurrentPos < count) {
            save = save.link;
            cuurrentPos++;
        }
        Node tempLast = save;
        save = save.link;
        while (save != first) {
            l2.insertAtLast(save.info);
            save = save.link;
        }
        tempLast.link = first;
        last = tempLast;
        return l2;
    }
}