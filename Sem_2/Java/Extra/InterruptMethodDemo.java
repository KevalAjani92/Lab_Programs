class InterruptMethod extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Thread Interrupted");
        }
        System.out.println("Keval Ajani");
    }
}
public class InterruptMethodDemo {
    public static void main(String[] args) {
        InterruptMethod i1=new InterruptMethod();
        i1.start();
        i1.interrupt();
    }
}
