class ThreadName extends Thread{
    public void run(){
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadNameDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Keval Ajani");
        System.out.println(Thread.currentThread().getName()); 
        
        ThreadName t1=new ThreadName();
        t1.setName("Keval");
        t1.start();
        System.out.println("\n"+Thread.currentThread().isAlive());
        System.out.println(t1.isAlive());

    }
}
