class InterruptedMethod extends Thread{
    public void run(){
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Thread Interrupted");
        }
    }
}
public class InterruptedMethodDemo {
    public static void main(String[] args) {
        InterruptedMethod i1=new InterruptedMethod();
        i1.start();
        i1.interrupt();
    }
}
