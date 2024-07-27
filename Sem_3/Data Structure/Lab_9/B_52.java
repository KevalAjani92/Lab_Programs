import java.util.Scanner;

class DQueue {
    int size;
    int[] QueueArray;

    public DQueue(int size) {
        this.size = size;
        QueueArray = new int[size];
    }

    int front = -1, rear = -1;

    public void DQINSERT_REAR(int x) {
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

    public void DQINSERT_FRONT(int x) {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }
        if (front == 0) {
            System.out.println("Overflow");
            return;
        }
        front--;
        QueueArray[front] = x;
    }

    public int DQDELETE_FRONT() {
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

    public int DQDELETE_REAR() {
        if (rear == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = QueueArray[rear];
        if (front == rear) {
            rear = front = -1;
        } else {
            rear--;
        }
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

public class B_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of DoubleEnded Queue : ");
        int n = sc.nextInt();
        DQueue q1 = new DQueue(n);

        while (true) {
            System.out.println("Enter Digit For Perform Below Operatio");
            System.out.println("1 for insert at front");
            System.out.println("2 for insert at rear");
            System.out.println("3 for delete from front");
            System.out.println("4 for delete from rear");
            System.out.println("5 for display");
            System.out.println("6 for exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element For insert : ");
                    int x = sc.nextInt();
                    q1.DQINSERT_FRONT(x);
                    break;
                case 2:
                    System.out.println("Enter Element For insert : ");
                    int y = sc.nextInt();
                    q1.DQINSERT_REAR(y);
                    break;
                case 3:
                    System.out.println("Removed Element : " + q1.DQDELETE_FRONT());
                    break;
                case 4:
                    System.out.println("Removed Element : " + q1.DQDELETE_REAR());
                    break;
                case 5:
                    q1.display();
                    break;
                case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter Valid Digit");
                    break;
            }
        }
    }
}
