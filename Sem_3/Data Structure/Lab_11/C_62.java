import Data_Structure_LL.*;
public class C_62 {
    public static void main(String[] args) {
        LinkedListDemo l1=new LinkedListDemo();
        l1.insertAtFirst(5);
        l1.insertAtFirst(4);
        l1.insertAtFirst(3);
        l1.insertAtFirst(2);
        l1.insertAtFirst(3);
        l1.insertAtFirst(2);
        l1.insertAtFirst(5);

        l1.removeDuplicate();
    }
}
