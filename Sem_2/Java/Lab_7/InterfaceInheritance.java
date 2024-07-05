interface P1{
    int constP1=10;
    void printConstP1();
}
interface P2{
    int constP2=20;
    void printConstP2();
}
class A12 implements P1,P2{
    public void printConstP1(){
        System.out.println("Constant 1="+constP1);
    }
    public void printConstP2(){
        System.out.println("Constant 2="+constP2);
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        A12 a=new A12();
        a.printConstP1();
        a.printConstP2();
    }
}
