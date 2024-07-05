package Data_Structure;
public class StackImpl {
    int top=-1;
    int n;
    int[] stackArray;
    
    public StackImpl(int n){
        this.n=n;
        stackArray=new int[n];
    }
    public StackImpl(int[] stackArray,int top){
        this.stackArray=stackArray;
        this.top=top;
    }
    public void push(int x){
        if(top>=n-1){
            System.out.println("Stack OverFlow");
            return;
        }
        this.top=this.top+1;
        stackArray[top]=x;
        return;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return stackArray[top+1];
    }
    public int peep(int i){
        if(top-i+1<=-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top-i+1];
    }
    public void change(int x,int i){
        if(top-i+1<=-1){
            System.out.println("Stack Underflow");
            return;
        }
        stackArray[top-i+1]=x;
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stackArray[i]);
        }
    }
}