abstract class Abs{
    int x;
    int y;
    abstract void f1();
}
class Absexam extends Abs{
    int z;
    void f1(){
        System.out.println("Hello World");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Absexam a1=new Absexam();
        a1.f1();
    }
}
