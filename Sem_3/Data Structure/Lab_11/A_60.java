import java.util.Scanner;

class StackImplement {

    class Node {

        int info;
        Node link;

        public Node(int info) {

            this.info = info;
            this.link = null;
        }
    }

    public Node first = null;

    public void insertAtFirst(int info) {

        Node newNode = new Node(info);

        newNode.link = first;
        first = newNode;
    }

    public int countStack(){
        
        Node save = first;
        int count = 0;

        while( save != null ){

            save = save.link;
            count++;
        }

        if( count == 0 ){
            
            return 0;
        }
        else{

            return count;
        }
    }

    public void displayStack(){

        if( first == null ){

            System.out.println("Stack Is  Empty");
        }
        
        Node save = first;

        System.out.print("Stack = [\n");

        while( save != null ){

            System.out.println( save.info );    

            save = save.link;
        }
        
        System.out.println("]");
    }

    public void pop(int info){

        if( first == null ){

            System.out.println("\nStack Is Empty");
            return;
        }

        Node save = first;

        while( save.link != null && save.link.info != info ){

            save = save.link;
        }

        if( save.link == null ){

            System.out.println("\nElement Not Found");
            return;
        }

        save.link = save.link.link;

        System.out.println("Poped Element :> " + save.link.info );

        System.out.println("After Poped Element :-> ");
        displayStack();
        
        return;
    }

    public void peep( int position ){

        int top = countStack();

        System.out.println("Top Is :-> "+top);

        if( first == null || position <= 0 || position > top ){

            System.out.println("Stack Underflow ");
            return;
        }
        
        Node save = first;

        for( int i = 1 ; i < position ; i++ ){

            save = save.link;
        }

        System.out.println("Element From Top Is :-> " + save.info );
    }

    public void change( int position , int info ){

        int top = countStack();

        System.out.println("Top Is :-> "+top);

        if( first == null || position <= 0 || position > top ){

            System.out.println("Stack Underflow ");
            return;
        }
        
        Node save = first;

        for( int i = 1 ; i < position ; i++ ){

            save = save.link;
        }

        save.info = info;

        System.out.println("Changed Element From Top Is :-> " + save.info );

        displayStack();
    }
}
public class A_60{
    public static void main(String[] args) {
        StackImplement stk=new StackImplement();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size Of Stack : ");
        int n =sc.nextInt();

        
    }
}