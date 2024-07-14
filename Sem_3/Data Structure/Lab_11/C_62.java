import Data_Structure_LL.*;
import Data_Structure_LL.LinkedListDemo.Node;
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


        LinkedListDemo.Node save=l1.first;
        LinkedListDemo.Node temp=l1.first;
        LinkedListDemo.Node prev=null;
        while(temp!=null){
            prev=temp;
            save=temp.link;
            while (save!=null) {
                if(temp.info==save.info){
                    prev.link=save.link;
                }else{
                    prev=save;
                }
                save=save.link;
            }
            temp=temp.link;
        }
            l1.displayLinkedList();
    }
}
