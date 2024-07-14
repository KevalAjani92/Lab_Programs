class Stack_Polish{
    int top = -1;
    int n;
    char[] stackArray;

    public Stack_Polish(int n) {
        this.n = n;
        stackArray = new char[n];
    }

    public Stack_Polish(char[] stackArray, int top) {
        this.stackArray = stackArray;
        this.top = top;
    }

    // public void push(int x) {
    //     if (top >= n - 1) {
    //         System.out.println("Stack OverFlow");
    //         return;
    //     }
    //     this.top = this.top + 1;
    //     stackArray[top] = x;
    //     return;
    // }
    public void push(char x) {
        if (top >= n - 1) {
            System.out.println("Stack OverFlow");
            return;
        }
        this.top = this.top + 1;
        stackArray[top] = x;
        return;
    }

    // public int pop() {
    //     if (top == -1) {
    //         System.out.println("Stack Underflow");
    //         return -1;
    //     }
    //     top--;
    //     return stackArray[top + 1];
    // }
    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '!';
        }
        top--;
        return stackArray[top + 1];
    }
    public char peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return '~';
        }
        return stackArray[top - i + 1];
    }
}