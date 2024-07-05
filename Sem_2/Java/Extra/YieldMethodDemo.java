class YieldMethod extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                // Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class YieldMethodDemo {
    public static void main(String[] args) {
        YieldMethod y1=new YieldMethod();
        y1.start();
        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println("Main Thread Executed");
        }
    }
}
