class A{
    private int x;
    private int y;
    A(int p,int q){
        x=p;
        y=q;
        System.out.println("Parent's Constructor Executed");
        System.out.println(x+" And "+y);
    }
    void fun1(){
        System.out.println("Parent Class Function1 Executed");
    }
    void fun2(){
        System.out.println("Parent Class Function2 Executed");
    }
}
class B extends A{
    int z;
    B(){
        super(5,6);
        System.out.println("Child's Constructor Executed");
    }
    void fun3(){
        System.out.println("Child Class Function Executed");
    }
}
public class Inherit {
    public static void main(String[] args) {
        B b1 = new B();
        
        b1.fun1();
        b1.fun2();
        b1.fun3();
    }
}
