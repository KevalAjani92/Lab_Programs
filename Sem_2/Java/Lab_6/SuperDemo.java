import java.lang.StringBuffer;
class Demo1{
    int a=20;
    Demo1(){
        System.out.println("Parent Class Constructor Executed");
    }
}
class Demo extends Demo1{
    int a=10;
    Demo(){
        super();
        System.out.println("Child Class Constructor Executed");
    }
    void print(){
        System.out.println("Parent Class:"+super.a);
        System.out.println("Child Class:"+a);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.print();
    }
}