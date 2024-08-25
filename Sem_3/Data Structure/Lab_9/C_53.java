import java.util.Scanner;

class PriorityQueueDemo {
    int size;
    Element[] queueArr;
    public PriorityQueueDemo(int size){
        this.size = size;
        queueArr = new Element[size];
    }
    class Element {
        int value;
        int priority;

        public Element(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }
    public int front = -1,rear = -1;

    public void insert(int value,int priority){
        if (rear >= size) {
            System.out.println("Queue Overflow");
            return;
        }
        Element e =new Element(value, priority);
        //For Empty Queue 
        if(front == -1){
            rear++;
            queueArr[rear] = e;
            if(front == -1){
                front = 0;
            }
            return;
        }
        for(int i=front;i<=rear;i++){
            if(queueArr[i].priority<e.priority){
                for(int j=rear+1;j>i;j--){
                    queueArr[j] = queueArr[j-1];
                }
                queueArr[i] = e;
                rear++;
                return;
            }
        }
        rear++;
        queueArr[rear] = e;
    }
    public Element delete(){
        if (front == -1) {
            System.out.println("Queue Underflow");
            return null;
        }
        Element temp = queueArr[front];
        if(front==rear){
            front = rear = -1;
        }else{
            front++;
        }
        return temp;
    }
    public void display(){
        if (front == -1) {
            System.out.println("Queue Is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print("("+queueArr[i].value +","+queueArr[i].priority+")");
            if(i!=rear){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}

public class C_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Queue : ");
        int n = sc.nextInt();

        PriorityQueueDemo queue =new PriorityQueueDemo(n);
        
        queue.insert(1, 2);
        queue.insert(2, 1);
        queue.insert(3, 4);
        queue.insert(4, 3);
        queue.insert(5, 4);

        queue.display();

        queue.delete();

        queue.display();
    }
}
