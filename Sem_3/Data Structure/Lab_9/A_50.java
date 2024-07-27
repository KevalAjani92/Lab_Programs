import java.util.Scanner;

class QueueDemo {
    int size;
    int[] QueueArray;

    public QueueDemo(int size) {
        this.size = size;
        QueueArray = new int[size];
    }

    int front = -1, rear = -1;

    public void Enqueue(int x) {
        if (rear > size) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        QueueArray[rear] = x;
        if (front == -1) {
            front = 0;
            return;
        }
    }

    public int Dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = QueueArray[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = front + 1;
        }
        return x;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue Is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(QueueArray[i]+" ");
        }
        System.out.println();
    }

}

public class A_50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size Of Queue : ");
        int n=sc.nextInt();
        QueueDemo q1=new QueueDemo(n);

        while (true) {
            System.out.println("Enter Digit For Perform Below Operatio");
            System.out.println("1 for Enqueue()");
            System.out.println("2 for Dequeue()");
            System.out.println("3 for Display()");
            System.out.println("4 for Exit");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element For insert : ");
                    int x=sc.nextInt();
                    q1.Enqueue(x);
                    break;
                case 2:
                    System.out.println("Removed Element : "+q1.Dequeue());
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Enter Valid Digit");
                    break;
            }
        }
    }
}