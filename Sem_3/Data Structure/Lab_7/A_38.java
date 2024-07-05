import java.util.Scanner;

class StackImpl {
    int top = -1;
    int n;
    int[] stackArray;

    public StackImpl(int n) {
        this.n = n;
        stackArray = new int[n];
    }

    public StackImpl(int[] stackArray, int top) {
        this.stackArray = stackArray;
        this.top = top;
    }

    public void push(int x) {
        if (top >= n - 1) {
            System.out.println("Stack OverFlow");
            return;
        }
        this.top = this.top + 1;
        stackArray[top] = x;
        return;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return stackArray[top + 1];
    }

    public int peep(int i) {
        // if(top<=i-1 || i<0){
        // return -1;
        // }
        // return stackArray[n-i];
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top - i + 1];
    }

    public void change(int x, int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return;
        }
        stackArray[top - i + 1] = x;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class A_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Stack : ");
        int n = sc.nextInt();
        StackImpl s = new StackImpl(n);
        int m;
        System.out.println("Enter Following Digits For Operations\n");
        System.out.println("1 for push()");
        System.out.println("2 for pop()");
        System.out.println("3 for peep()");
        System.out.println("4 for change()");
        System.out.println("5 for display()");
        System.out.println("-1 for exit");
        do{
            
            System.out.print("Enter Digit for Operation : ");
            m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.print("Enter Element To Push : ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    System.out.print(s.pop());
                    break;
                case 3:
                    System.out.print("Enter Index To Show element : ");
                    int i = sc.nextInt();
                    System.out.println(s.peep(i));
                    break;
                case 4:
                    System.out.print("Enter Element To Change : ");
                    int y = sc.nextInt();
                    System.out.print("Enter Index To Change : ");
                    int j = sc.nextInt();
                    s.change(y, j);
                    break;
                case 5:
                    s.display();
                    break;

                default:
                    break;
            }
        }while (m >= 1 && m <= 5); 
    }
}