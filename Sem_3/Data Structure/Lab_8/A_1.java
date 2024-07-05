class LinkedListDemo{
    class Node{
        int info;
        Node link;

        public Node(int info){
            this.info=info;
            this.link=null;
        }

        public Node first=null;

        public Node insertAtFirst(int data){
            Node newNode=new Node(data);

            if(first==null){
                first=newNode;
                return first;
            }
            Node temp=first;
            first=newNode;
            first.link=temp;

            return first;
        }
        public Node insertAtEnd(int data){
            Node newNode=new Node(data);
            if(first==null){
                first=newNode;
                return first;
            }
            Node last=first;
            while(last.link!=null){
                last=last.link;
            }
            last.link=newNode;
            return first;
        }
        
    }
}