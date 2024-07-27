package Data_Structure_Doubly_LL;

public class DBLY_LinkedList {
    class Node {
        int info;
        Node lptr = null;
        Node rptr = null;

        public Node(int info) {
            this.info = info;
            this.lptr = null;
            this.rptr = null;
        }
    }

    public Node first = null;
    public Node last = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        // list is Empty
        if (last == null) {
            first = last = newNode;
            return;
        }
        newNode.rptr = first;
        first.lptr = newNode;
        first = newNode;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        // list is Empty
        if (last == null) {
            first = last = newNode;
            return;
        }
        newNode.rptr = last.rptr;
        newNode.lptr = last;
        last.rptr = newNode;
        last = newNode;
    }

    public void insertInOrder(int data) {
        Node newNode = new Node(data);
        // list is Empty
        if (last == null) {
            first = last = newNode;
            return;
        }
        if (newNode.info <= first.info) {
            newNode.rptr = first;
            first.lptr = newNode;
            first = newNode;
            return;
        }
        Node save = first;
        while (save.rptr != null && newNode.info >= save.rptr.info) {
            save = save.rptr;
        }
        if (save.rptr == null) {
            save.rptr = newNode;
            newNode.lptr = save;
            last = newNode;
            return;
        }
        newNode.lptr = save;
        newNode.rptr = save.rptr;
        save.rptr = newNode;
        newNode.rptr.lptr = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        // list is Empty
        if (last == null) {
            first = last = newNode;
            return;
        }
        if (position == 1) {
            insertAtFirst(data);
        } else {
            Node save = first;
            int count = 1;
            while (save != null && count < position) {
                save = save.rptr;
                count++;
            }
            if (save == null) {
                insertAtLast(data);
            } else {
                newNode.lptr = save.lptr;
                newNode.rptr = save;
                save.lptr.rptr = newNode;
                save.lptr = newNode;
            }
        }
    }

    public void deleteNode(int data) {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        if (first == last) {
            first = last = null;
            return;
        }
        Node save = first;
        Node prev = null;
        while (save != last && save.info != data) {
            prev = save;
            save = save.rptr;
        }
        if (save == first) {
            first = first.rptr;
            first.lptr = null;
        } else if (save == last) {
            last = save.lptr;
            last.rptr = null;
        } else {
            save.lptr.rptr = save.rptr;
            save.rptr.lptr = save.lptr;
        }
    }

    public int countNode() {
        int count = 0;
        if (first == null) {
            return count;
        }
        Node save = first;
        while (save != null) {
            count++;
            save = save.rptr;
        }
        return count;
    }

    public void displayLinkedList() {
        if (last == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save = first;
        while (save != null) {
            System.out.print(save.info);
            if (save.rptr != null) {
                System.out.print("->");
            }
            save = save.rptr;
        }
        System.out.println();
    }
    private void deleteN(Node save){
        if (save == first) {
            first = first.rptr;
            first.lptr = null;
        } else if (save == last) {
            last = save.lptr;
            last.rptr = null;
        } else {
            save.lptr.rptr = save.rptr;
            save.rptr.lptr = save.lptr;
        }
    }
    public void deleteAlternate(int oddEvenDelete) {
        if (first == null) {
            System.out.println("LinkedList Is Empty");
            return;
        }
        Node save = first;
        int count = 1;
        if (oddEvenDelete % 2 == 1) {
            while (save != null) {
                if (count % 2 != 0) {
                    deleteN(save);
                }
                count++;
                save = save.rptr;
            }
        } else if (oddEvenDelete % 2 == 0) {
            while (save != null) {
                if (count % 2 == 0) {
                    deleteN(save);
                }
                count++;
                save = save.rptr;
            }
        }
    }
}
