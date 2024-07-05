class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority t1=new ThreadPriority();
        t1.start();
        System.out.println("Class:"+t1.getPriority());
        t1.setPriority(10);
        System.out.println("Class:"+t1.getPriority());
        System.out.println("Main:"+Thread.currentThread().getPriority());
    }
}
