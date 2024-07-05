interface i1{
    int x=6;
    void f1();
    static void f2(){
        System.out.println(x);
    }
}
interface i2 extends i1{
    int x=9;
    int y=2;
    void f3();
    static void f2(){
        System.out.println(x);
    }
}
class interf1 implements i2{
    public void f1(){

    }
    public void f3(){

    }
    static void f2(){
        System.out.println(x);
    } 
}
public class InterfaceExample {
    public static void main(String[] args) {
        interf1.f2();
        System.out.println(interf1.x);
        i1.f2();
    }
}
