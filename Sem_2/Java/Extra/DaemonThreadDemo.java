class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Keval");
    }
}
public class DaemonThreadDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        DaemonThread d1=new DaemonThread();
        d1.setDaemon(true);
        d1.start();
        
    }
}
