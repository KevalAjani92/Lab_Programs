class SleepMethod1 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            } 
        }    
        catch (Exception e) {
                e.printStackTrace();
        }
    }
}
class SleepMethod2 extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            } 
        }    
        catch (Exception e) {
                e.printStackTrace();
        }
    }
}
public class SleepMethodDemo {
    public static void main(String[] args) {
        SleepMethod1 s1=new SleepMethod1();
        s1.start();
        SleepMethod2 s2=new SleepMethod2();
        s2.start();
    }
}
