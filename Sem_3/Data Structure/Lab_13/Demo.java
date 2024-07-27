import Data_Structure_CIR_LL.*;
import Data_Structure_Doubly_LL.*;
public class Demo {
    public static void main(String[] args) {
        DBLY_LinkedList l1=new DBLY_LinkedList();
        l1.insertAtLast(2);
        l1.insertAtLast(4);
        l1.insertAtLast(6);
        l1.insertInOrder(7);
        l1.insertInOrder(8);
        l1.insertInOrder(1);
        l1.insertAtPosition(10, 8);
        System.out.println(l1.countNode());
        l1.displayLinkedList();
    }
}
