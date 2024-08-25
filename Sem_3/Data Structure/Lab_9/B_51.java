import java.util.Scanner;

class CircularQueue {
    int size;
    int[] QueueArray;

    public CircularQueue(int size) {
        this.size = size;
        QueueArray = new int[size];
    }

    int front = -1, rear = -1;

    public void cqinsert(int x) {
        if (front == ((rear + 1) % size)) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % size;
        QueueArray[rear] = x;
        if (front == -1) {
            front = 0;
            return;
        }
    }

    public int cqdelete() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = QueueArray[front];
        if (front == rear) {
            front = rear = -1;
            return x;
        }
        front = (front + 1) % size;
        return x;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue Is Empty");
            return;
        }
        if (front > rear) {
            for (int i = front; i < size; i++) {
                System.out.print(QueueArray[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(QueueArray[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(QueueArray[i] + " ");
        }
        System.out.println();
    }
}

public class B_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Circular Queue : ");
        int n = sc.nextInt();
        CircularQueue q1 = new CircularQueue(n);

        while (true) {
        System.out.println("Enter Digit For Perform Below Operatio");
        System.out.println("1 for insert");
        System.out.println("2 for delete");
        System.out.println("3 for display");
        System.out.println("4 for Exit");
        int choice=sc.nextInt();

        switch (choice) {
        case 1:
        System.out.println("Enter Element For insert : ");
        int x=sc.nextInt();
        q1.cqinsert(x);
        break;
        case 2:
        System.out.println("Removed Element : "+q1.cqdelete());
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
