import Data_Structure_CIR_LL.*;
public class B_74 {
    public static void main(String[] args) {
        CIR_LinkedList l1=new CIR_LinkedList();

        l1.insertAtLast(1);
        l1.insertAtLast(2);
        l1.insertAtLast(3);
        l1.insertAtLast(4);
        l1.insertAtLast(5);
        l1.insertAtLast(6);
        l1.insertAtLast(7);

        CIR_LinkedList l2= l1.splitIntoTwoHalves();
        l1.displayLinkedList();
        l2.displayLinkedList();
    }
}
