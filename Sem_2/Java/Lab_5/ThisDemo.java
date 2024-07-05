import java.util.Scanner;
class Demo{
    int x;
    static int y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
        System.out.println("X="+x+"Y="+y);
    }
}
public class ThisDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        Demo d1=new Demo();
        d1.f1(a, b);
        d1.print();
        sc.close();
    }
}