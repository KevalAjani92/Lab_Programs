class JoinMethod extends Thread{
    static Thread mainThread;
    public void run(){
        try{
            // mainThread.join(2000);  In this Case main Thread will be executed first
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class JoinMethodDemo {
    public static void main(String[] args) {
        JoinMethod.mainThread=Thread.currentThread();
        JoinMethod j1=new JoinMethod();
        j1.start();
        try{
            j1.join(3000);
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
